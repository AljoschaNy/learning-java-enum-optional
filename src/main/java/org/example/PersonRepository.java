package org.example;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonRepository {
    private List<Person> persons;

    public PersonRepository(List<Person> persons) {
        this.persons = persons;
    }

    public Optional<Person> getPersonById(String id) {
        for(Person person : persons) {
            if(person.id().equals(id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonRepository that = (PersonRepository) o;
        return Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(persons);
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "persons=" + persons +
                '}';
    }
}
