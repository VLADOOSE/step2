package step4.Car;

public class Car{
    private String brand;
    private String model;
    private int year;
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    public void displayInfo(){
        System.out.println("Brand: " + this.brand + "\n" + "Model: " + this.model + "\n" + "Year: " + this.year);
    }
}
