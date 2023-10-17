package arqui_Hexa.core.driver_ports;

import arqui_Hexa.core.domain.Book;
import arqui_Hexa.core.driven_ports.BookRepository;

public class BookServiceImpl implements BookService {

private BookRepository bookRepository;

public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

}

public Book getBook(Long id) {

        return bookRepository.findById(id);

}

}