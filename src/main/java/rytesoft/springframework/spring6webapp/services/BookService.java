package rytesoft.springframework.spring6webapp.services;

import rytesoft.springframework.spring6webapp.domain.Book;

public interface BookService {
    Iterable<Book>findAll();

}
