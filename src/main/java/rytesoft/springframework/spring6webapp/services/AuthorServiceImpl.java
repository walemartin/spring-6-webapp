package rytesoft.springframework.spring6webapp.services;

import org.springframework.stereotype.Service;
import rytesoft.springframework.spring6webapp.domain.Author;
import rytesoft.springframework.spring6webapp.domain.Book;
import rytesoft.springframework.spring6webapp.repositories.AuthoRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthoRepository authoRepository;

    public AuthorServiceImpl(AuthoRepository authoRepository) {
        this.authoRepository = authoRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authoRepository.findAll();
    }
}
