package arqui_Hexa.core.driven_ports;

import arqui_Hexa.core.domain.Book;

public interface BookRepository {

Book findById(Long id);

}