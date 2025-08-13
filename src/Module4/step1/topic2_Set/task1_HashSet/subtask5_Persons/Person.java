package Module4.step1.topic2_Set.task1_HashSet.subtask5_Persons;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private int age;
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
