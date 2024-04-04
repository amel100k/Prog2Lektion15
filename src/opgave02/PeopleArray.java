package opgave02;

import java.util.ArrayList;
import java.util.List;

public class PeopleArray {
    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void printPeople() {
        System.out.println(people);
    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public Person findFirst(PersonPredicate filter) {
        for (Person person : people) {
            if (filter.test(person)) {
                return person;
            }
        }
        return null;
    }
    public List<Person> findAll(PersonPredicate filter){
        ArrayList personsthat = new ArrayList<>();
        for (Person person : people) {
            if (filter.test(person)){
                personsthat.add(person);
            }
        }
        return personsthat;
    }
}
