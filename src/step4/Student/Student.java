package step4.Student;

import step4.Person.Person;

public class Student extends Person {
    private String studentId;
    public Student(String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getStudentId(){
        return this.studentId;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println(" StudentId: " + this.studentId);
    }
}
