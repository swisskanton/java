package guru.spring6webapp.services;

import guru.spring6webapp.domain.Book;

import java.util.Iterator;

public interface BookService {

    Iterator<Book> findAll();
}
