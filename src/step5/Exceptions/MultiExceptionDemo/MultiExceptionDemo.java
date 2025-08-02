package step5.Exceptions.MultiExceptionDemo;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MultiExceptionDemo {
    public static void main(String[] args) {
        ArrayList arrayList = null;
        int[] a = new int[] {1, 2, 3, 4};
        try{
            arrayList.addFirst(5);
            System.out.println(a[4]);
        }catch (ArrayIndexOutOfBoundsException | NullPointerException e){
            e.printStackTrace();
        }
    }
}
