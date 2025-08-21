package Module4.step2.topic2_Streams.task9_PersonToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Vanya", 21),
                new Person("Albert", 43),
                new Person("Kostya", 55),
                new Person("Valya", 24)
        ));
        list.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge))
                .forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
