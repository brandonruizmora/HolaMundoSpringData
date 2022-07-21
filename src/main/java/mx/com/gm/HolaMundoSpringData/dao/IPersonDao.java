package mx.com.gm.HolaMundoSpringData.dao;

import mx.com.gm.HolaMundoSpringData.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface IPersonDao extends CrudRepository<Person, Long> {
}
