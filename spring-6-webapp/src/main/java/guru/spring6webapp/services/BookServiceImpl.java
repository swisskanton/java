package guru.spring6webapp.services;

import guru.spring6webapp.domain.Book;
import guru.spring6webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Iterator;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterator<Book> findAll() {
        return (Iterator<Book>) bookRepository.findAll();
    }
}
