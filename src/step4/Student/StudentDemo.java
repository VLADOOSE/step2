package step4.Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Vlad", 20, "1001");
        // тут немного затуп вышел, вызвал супер в конструкторе без параметров(просто super()), получилось что ни имени, ни возраста, только студент айди имело значение
        student.displayInfo();
    }
}
