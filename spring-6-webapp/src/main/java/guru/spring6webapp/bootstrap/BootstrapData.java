package guru.spring6webapp.bootstrap;

import guru.spring6webapp.domain.Author;
import guru.spring6webapp.domain.Book;
import guru.spring6webapp.repositories.AuthorRepository;
import guru.spring6webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book book = new Book();
        book.setTitle("Domain Driver Design");
        book.setIsbn("12345678");

        Author ericSaved = authorRepository.save(eric);
        Book bookSaved = bookRepository.save(book);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book rodBook = new Book();
        rodBook.setTitle("J2EE Development with EJB");
        rodBook.setIsbn("45757585");

        Author rodSaved = authorRepository.save(rod);
        Book rodBookSaved = bookRepository.save(rodBook);

        ericSaved.getBooks().add(bookSaved);
        rodSaved.getBooks().add(rodBookSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
    }
}
