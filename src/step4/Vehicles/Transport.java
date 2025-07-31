package step4.Vehicles;

public abstract class Transport {
    public String model;

    public Transport(String model){this.model = model;}


    public abstract void move();
    public  void printInfo(){
        System.out.println(model);
    }
}
