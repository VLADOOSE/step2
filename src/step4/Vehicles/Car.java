package step4.Vehicles;

public class Car extends Transport{
    private Engine engine;
    public Car(String model, Engine engine){
        super(model);
        this.engine = engine;

    }
    @Override
    public void move() {
        System.out.println("The car " + this.model + " is moving with " + this.engine.getHorsePower() + "hp");
    }

    @Override
    public  void printInfo(){
        System.out.println(model);
    }

    public static void main(String[] args) {
        Engine w1 = new Engine("2JZ");
        Engine w2 = new Engine("S58");
        Car car1 = new Car("SUPRA", w1);
        Car car2 = new Car("M3", w2);
        System.out.println(Engine.getEngineCount());
    }
}
