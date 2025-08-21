package Module4.step2.topic2_Streams.task10_PersonSort;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("Vanya", 21),
                new Person("Albert", 43),
                new Person("Kostya", 55),
                new Person("Valya", 21)
        ));
        list.stream()
                .sorted(Comparator.comparingInt(Person::getAge).thenComparing(Person::getName))
                .toList()
                .forEach(System.out::println);
    }
}
