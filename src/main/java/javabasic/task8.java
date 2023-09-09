package javabasic;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        System.out.println("Сумма всех нечетных чисел от 1 до числа n.");
        int arraySize = 0;
        while (arraySize < 1) {
            if (arraySize >= 1) {
                arraySize = integer();
                break;
            }
            arraySize = integer();
        }
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = 1 + i;
        }
        array[arraySize - 1] = arraySize;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма всех нечетных чисел от 1 до введенного числа n равна: " + sum);
    }

    public static int integer() {
        System.out.println("Введите любое целое положительное больше нуля число n: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int integer = 0;
            String a = scan.nextLine();
            try {
                integer = Integer.parseInt(a);
                return integer;
            } catch (NumberFormatException ex) {
                System.out.println("Введите любое целое положительное больше нуля число n: ");
            }
        }
    }
}