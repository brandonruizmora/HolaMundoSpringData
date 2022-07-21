package mx.com.gm.HolaMundoSpringData.services;

import mx.com.gm.HolaMundoSpringData.domain.Person;

import java.util.List;

public interface IPersonService {

    public List<Person> ListPeople();

    public void save(Person person);

    public void delete(Person person);

    public Person findPerson(Person person);

}
