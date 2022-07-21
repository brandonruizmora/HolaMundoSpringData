package mx.com.gm.HolaMundoSpringData.services;

import mx.com.gm.HolaMundoSpringData.dao.IPersonDao;
import mx.com.gm.HolaMundoSpringData.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonImplementation implements IPersonService {

    @Autowired
    IPersonDao iPersonDao;

    @Override
    public List<Person> ListPeople() {
        return (List<Person>) iPersonDao.findAll();
    }

    @Override
    public void save(Person person) {
        iPersonDao.save(person);
    }

    @Override
    public void delete(Person person) {
        iPersonDao.delete(person);
    }

    @Override
    public Person findPerson(Person person) {
        return iPersonDao.findById(person.getIdPerson()).orElse(null);
    }
}
