package step4.StrategyCommand;

import java.util.Scanner;

public class StrategyCommandDemo {
    public static void main(String[] args) {
        CommandProcessor com = new CommandProcessor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Commands available: start, stop, pause");
        while(true) {
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            com.process(command);
            //первое задание, над которым пришлось посидеть часик,
            // чтоб допереть, как правильно организовать надо было интерфейс, класс,
            // чтоб работало как я хотел и как понял должно
            //в итоге и сам допёр) подсмотреть даже нельзя было, оно и к лучшему
        }
    }
}
