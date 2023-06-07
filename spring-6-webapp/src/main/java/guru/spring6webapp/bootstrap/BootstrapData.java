package guru.spring6webapp.bootstrap;

import guru.spring6webapp.domain.Author;
import guru.spring6webapp.domain.Book;
import guru.spring6webapp.domain.Publisher;
import guru.spring6webapp.repositories.AuthorRepository;
import guru.spring6webapp.repositories.BookRepository;
import guru.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
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

        ericSaved.getBooks().add(bookSaved);
        authorRepository.save(ericSaved);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book rodBook = new Book();
        rodBook.setTitle("J2EE Development with EJB");
        rodBook.setIsbn("45757585");

        Author rodSaved = authorRepository.save(rod);
        Book rodBookSaved = bookRepository.save(rodBook);

        rodSaved.getBooks().add(rodBookSaved);
        authorRepository.save(rodSaved);

        Publisher pub = new Publisher();
        pub.setPublisherName("Beacon Publishing Group");
        pub.setAddress("1250 Broadway");
        pub.setCity("New York");
        pub.setState("NY");
        pub.setZipCode("10001");

        Publisher pubSaved = publisherRepository.save(pub);

        bookSaved.setPublisher(pubSaved);
        rodBookSaved.setPublisher(pubSaved);
        bookRepository.save(bookSaved);
        bookRepository.save(rodBookSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());
    }
}
