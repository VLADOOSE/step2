package step4.SuperAnimals;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Гав!");
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Tuzik", "Dvornyaga(Stray)");
        dog.makeSound();
    }
}
