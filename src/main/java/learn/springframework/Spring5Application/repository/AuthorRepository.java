package learn.springframework.Spring5Application.repository;

import learn.springframework.Spring5Application.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
