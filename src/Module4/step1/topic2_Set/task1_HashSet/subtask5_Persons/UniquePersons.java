package Module4.step1.topic2_Set.task1_HashSet.subtask5_Persons;

import java.util.HashSet;

public class UniquePersons {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person("Vasya", 21);
        Person p2 = new Person("Igor", 36);
        Person p3 = new Person("Lera", 27);


        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p3);
        for(Person p : hashSet) {
            System.out.println(p);
        }
    }
}
