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
        while(!q) {
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
                    if (category.equals("length")) {
                        BaseConverter baseConverter = new LengthConverter();
                        LengthUnit.valueOf(fromUnit).setNum(value);
                        res = baseConverter.convert(LengthUnit.valueOf(fromUnit), LengthUnit.valueOf(toUnit));
                    } else if (category.equals("temperature")) {
                        BaseConverter baseConverter = new TemperatureConverter();
                        TemperatureUnit.valueOf(fromUnit).setNum(value);
                        res = baseConverter.convert(TemperatureUnit.valueOf(fromUnit), TemperatureUnit.valueOf(toUnit));
                    } else if (category.equals("weight")) {
                        BaseConverter baseConverter = new WeightConverter();
                        WeightUnit.valueOf(fromUnit).setNum(value);
                        res = baseConverter.convert(WeightUnit.valueOf(fromUnit), WeightUnit.valueOf(toUnit));

                    } else {
                        throw new InvalidCategoryException("Неизвестная категория: " + category);
                    }
                    System.out.println(value + " " + fromUnit + " = " + res + " " + toUnit);
                }
            }catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.err.println("Вы ввели строку в неправильном формате");
            }catch (NumberFormatException e){
                e.printStackTrace();
                System.err.println("Вы ввели не число");
            }catch (IllegalArgumentException e){
                e.printStackTrace();
                System.err.println("Вы ввели неправильные ед измерения");
            }

            }
        }
    }

