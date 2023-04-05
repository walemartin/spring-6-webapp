package rytesoft.springframework.spring6webapp.services;

import rytesoft.springframework.spring6webapp.domain.Author;
import rytesoft.springframework.spring6webapp.domain.Book;

public interface AuthorService {
    Iterable<Author>findAll();
}
