package learn.springframework.Spring5Application.repository;

import learn.springframework.Spring5Application.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
