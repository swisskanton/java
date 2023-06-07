package guru.spring6webapp.services;

import guru.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
