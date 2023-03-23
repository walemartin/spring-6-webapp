package rytesoft.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import rytesoft.springframework.spring6webapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
