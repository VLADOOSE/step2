package step5.Exceptions.FileNotFoundException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("sff");
            String a = String.valueOf(fileReader.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Нет файла");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
