package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        System.out.println("Операции с массивом");
        int arraySize = arraySize();
        double[] array = new double[arraySize];
        System.out.println("Для заполнения массива введите числа типа double");
        for (int i = 0; i < array.length; i++) {
            array[i] = doubleImput();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / arraySize;
        double[] result = new double[arraySize];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * average;
        }
        System.out.println(Arrays.toString(result));
    }

    public static double doubleImput() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double doubleImput = 0;
            String a = scan.nextLine();
            try {
                doubleImput = Double.parseDouble(a);
                return doubleImput;
            } catch (NumberFormatException ex) {
                System.out.println("Введите вещественное число");
            }
        }
    }

    public static int arraySize() {
        System.out.println("Введите размер массива: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int arraySize = 0;
            String a = scan.nextLine();
            try {
                arraySize = Integer.parseInt(a);
                return arraySize;
            } catch (NumberFormatException ex) {
                System.out.println("Введите число");
            }
        }
    }
}