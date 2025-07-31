package step4.Computer;

public class Computer {
    private String brand;
    private String model;
    private int ram;
    public Computer(String brand, String model, int ram){
        this.brand = brand;
        this.model = model;
        this.ram = ram;
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
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return this.ram;
    }
    public void displaySpecs(){
        System.out.println("Brand: " + this.brand + "\n" + "Model: " + this.model + "\n" + "RAM: " +ram);
    }
}
