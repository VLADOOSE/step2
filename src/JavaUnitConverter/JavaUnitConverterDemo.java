package JavaUnitConverter;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class JavaUnitConverterDemo {
    public static void main(String[] args) {
        boolean q = false;
        System.out.println("Добро пожаловать в конвертер ед измерения" + "\n" +
                "Введите строку в формате: category value from_unit to_unit" + "\n"
                + " Для выхода введите q");
        while (!q) {
            try {
                Scanner scanner = new Scanner(System.in);
                String query = scanner.nextLine();
                if (query.equals("q")) {
                    q = true;
                    System.out.println("Выход");
                } else {
                    String[] arrQuery = query.split(" ");
                    String category = arrQuery[0];
                    String fromUnit = arrQuery[2].toUpperCase();
                    String toUnit = arrQuery[3].toUpperCase();
                    double res;
                    double value = Double.parseDouble(arrQuery[1]);
                    switch (category) {
                        case "length":
                            BaseConverter<LengthUnit> lengthConverter = new LengthConverter<>();
                            LengthUnit.valueOf(fromUnit).setNum(value);
                            res = lengthConverter.convert(LengthUnit.valueOf(fromUnit), LengthUnit.valueOf(toUnit));
                            break;
                        case "temperature":
                            BaseConverter<TemperatureUnit> temperatureConverter = new TemperatureConverter<>();
                            TemperatureUnit.valueOf(fromUnit).setNum(value);
                            res = temperatureConverter.convert(TemperatureUnit.valueOf(fromUnit), TemperatureUnit.valueOf(toUnit));
                            break;
                        case "weight":
                            BaseConverter<WeightUnit> weightConverter = new WeightConverter<>();
                            WeightUnit.valueOf(fromUnit).setNum(value);
                            res = weightConverter.convert(WeightUnit.valueOf(fromUnit), WeightUnit.valueOf(toUnit));
                            break;

                        default:
                            throw new InvalidCategoryException("Неизвестная категория: " + category);
                    }
                    System.out.println(value + " " + fromUnit + " = " + res + " " + toUnit);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Вы ввели строку в неправильном формате");
            } catch (NumberFormatException e) {
                System.err.println("Вы ввели не число");
            } catch (IllegalArgumentException e) {
                System.err.println("Вы ввели неправильные ед измерения");
            }

        }
    }
}

