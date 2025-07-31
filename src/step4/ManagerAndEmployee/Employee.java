package step4.ManagerAndEmployee;

public class Employee {
    private String name;
    private int salary;
    private static int employeeCount;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }
    public static int getCount(){
        return employeeCount;
    }
    public int getAnnualSalary(){
        return this.salary * 12;
    }
}
