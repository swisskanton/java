package guru.spring6webapp.services;

import guru.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}