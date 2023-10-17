package arqui_Hexa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import arqui_Hexa.core.driven_ports.BookRepository;
import arqui_Hexa.core.driver_ports.BookService;
import arqui_Hexa.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);

}

}