import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Lambdas2 {
    public static void main(String[] args) {
        Faker faker = new Faker();

        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            persons.add(new Person(faker.name().firstName(), faker.name().lastName(), new Random().nextInt(40) + 10));
        }

        Stream<Person> result = persons.stream()
                .filter(per -> per.getAlter() < 40 && per.getAlter() > 20)
                .sorted(Comparator.comparing(person -> (person.getVorname() + " " + person.getNachname())))
                .distinct()
                .limit(10);

        result.forEach(System.out::println);
    }
}
