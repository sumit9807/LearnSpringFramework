package learn.springframework.Spring5Application.repository;

import learn.springframework.Spring5Application.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
