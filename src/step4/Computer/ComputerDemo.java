package step4.Computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer computer = new Computer("Apple", "MacBook Air", 8);
        computer.displaySpecs(); //Да, можно было добавить "ГБ" к выводу RAM
    }
}
