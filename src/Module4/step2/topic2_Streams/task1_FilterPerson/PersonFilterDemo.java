package Module4.step2.topic2_Streams.task1_FilterPerson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonFilterDemo {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        Person person = new Person(10, "Petya");
        Person person1 = new Person(20, "Vasilisa");
        Person person2 = new Person(30, "Kolya");
        Person person3 = new Person(33, "Ivan");
        Person person4 = new Person(60, "Vitalya");
        Person person5 = new Person(70, "Alexandr");
        list.add(person);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        List<Person> l = list.stream()
                .filter(n -> n .getAge()> 30)
                .collect(Collectors.toList());
        for(Person p : l){
            System.out.println(p);
        }
    }
}
