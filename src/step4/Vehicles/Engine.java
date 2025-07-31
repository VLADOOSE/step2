package step4.Vehicles;

public class Engine extends Transport{
    public int horsePower;
    public static int engineCount;

    public Engine(String model) {
        super(model);
        engineCount++;
    }

    public int getHorsePower(){
        return this.horsePower;
    }
    public static int getEngineCount(){
        return engineCount;
    }

    @Override
    public void move() {

    }

    @Override
    public  void printInfo(){
        System.out.println(model);
    }
}
