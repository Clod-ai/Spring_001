package arqui_Hexa.db_driven_adapter;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import arqui_Hexa.core.domain.Book;
import arqui_Hexa.core.domain.BookDoesNotExistException;
import arqui_Hexa.core.driven_ports.BookRepository;
import arqui_Hexa.db_driven_adapter.domain.BookEntity;
import arqui_Hexa.db_driven_adapter.jparepository.HAAJpaRepository;

@Component
public class JpaBookRepository implements BookRepository {
   

@Autowired //enlaza repositorio y servicio

private HAAJpaRepository haaJpaRepository;

    @Override

public Book findById(Long id) {

Optional<BookEntity> bookEntityOptional = haaJpaRepository.findById(id);

BookEntity bookEntity = bookEntityOptional.orElseThrow(BookDoesNotExistException::new);

return bookEntity.toBook();

}

}