package opgave02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        PeopleArray peopleArray = new PeopleArray();
        addPeople(peopleArray);

        //Den første person der hedder Klaus
        System.out.println("Den første person der hedder Klaus: " + peopleArray.findFirst(p -> p.getName().equals("Klaus")));

        //Den første person der har et navn med længden 4
        System.out.println("Den første person der har et navn med længden 4: " + peopleArray.findFirst(p -> p.getName().length() == 4));

        //Indsæt kode herunder der kalder metoderne findFirst og findAll som beskrevet i opgave 1

        //Første person med alderen 44
        System.out.println("Første person med alderen 44: " + peopleArray.findFirst(p -> p.getAge() == 44));

        //Første person der starter med S
        System.out.println("Første person, hvis navn starter med 'S': " + peopleArray.findFirst(p -> p.getName().startsWith("S")));

        //Find den første person i listen af personer, hvis navn indeholder mere
        //end et ’i’
        System.out.println("Første person, hvis navn indeholder mere end et 'i': " + peopleArray.findFirst(p -> {
            int x = 0;
            for (int i = 0; i < p.getName().length(); i++) {
                if (p.getName().charAt(i) == 'i'){
                    x++;
                }
                if (x > 1){
                    return true;
                }
            }
            return false;
        }));

        //Find den første person i listen af personer, hvis alder er lig længden af
        //navnet.
        System.out.println("Første person, hvis alder er lig længden af navnet: " + peopleArray.findFirst(p -> p.getName().length() == p.getAge()));

        List<Person> people = peopleArray.findAll(p -> p.getAge() > 30);

        //Find alle personer, hvis navn indeholder et ’i’
        System.out.println("Alle personer, hvis navn indeholder et 'i': " + peopleArray.findAll(person -> person.getName().contains("i")));

        //Find alle personer, hvis navn starter med S
        System.out.println("Alle personer, hvis navn starter med S: " + peopleArray.findAll(person -> person.getName().startsWith("S")));

        //Find alle personer, hvis navn har længde 5
        System.out.println("Alle personer, hvis navn har længde 5: " + peopleArray.findAll(person -> person.getName().length() == 5));

        //Find alle personer, hvis alder er mindst 6 og mindre end 40
        System.out.println("Alle personer, hvis alder er mindst 6 og mindre end 40: " + peopleArray.findAll(person -> person.getAge() >= 6 && person.getAge() < 40));
    }

    private static void addPeople(PeopleArray peopleArray) {
        peopleArray.addPerson(new Person("Bent", 25));
        peopleArray.addPerson(new Person("Susan", 34));
        peopleArray.addPerson(new Person("Mikael", 60));
        peopleArray.addPerson(new Person("Klaus", 44));
        peopleArray.addPerson(new Person("Birgitte", 17));
        peopleArray.addPerson(new Person("Liselotte", 9));
    }
}
