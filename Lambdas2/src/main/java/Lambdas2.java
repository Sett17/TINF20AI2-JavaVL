import com.github.javafaker.Faker;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambdas2 {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Supplier<Person> nextPerson = () -> new Person(faker.name().firstName(), faker.name().lastName(), new Random().nextInt(40) + 10);

        Set<Person> persons = Stream.generate(nextPerson).limit(1_000_000).collect(Collectors.toSet());

//        ArrayList<Person> persons = new ArrayList<>();
//        for (int i = 0; i < 1000; i++) {
//            persons.add(new Person(faker.name().firstName(), faker.name().lastName(), new Random().nextInt(40) + 10))
////            persons.add(nextPerson.get());
//        }

        Stream<Person> result = persons.stream()
                .filter(per -> per.getAlter() <= 40 && per.getAlter() >= 20)
                .sorted(Comparator.comparing(person -> (person.getVorname() + " " + person.getNachname())))
                .limit(10);

        result.forEach(System.out::println);
    }
}
