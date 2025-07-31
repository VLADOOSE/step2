package step4.ManagerAndEmployee;

public class Manager extends Employee{
    private int bonus;
    public Manager(String name, int salary,int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    @Override
    public int getAnnualSalary(){
        return super.getAnnualSalary() + this.bonus;
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("Ivan", 100000, 20000);
        Manager m2 = new Manager("Vasya", 200000, 100000);
        System.out.println(getCount());
    }
}
