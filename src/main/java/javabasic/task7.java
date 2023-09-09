package javabasic;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        final String x = "Константа";
        final String y = "100";
        final String z = "стоп";
        Scanner scan = new Scanner(System.in);
        int arraySize = arraySize();
        String[] array = new String[arraySize];
        System.out.println("Для заполнения массива введите данные:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextLine();
        }
        scan.close();
        for (int i = 0; i < array.length; i++) {
            if (x.equals(array[i])) {
                System.out.println(array[i] + " - данное значение имеется в константах");
                break;
            } else if (y.equals(array[i])) {
                System.out.println(array[i] + " - данное значение имеется в константах");
                break;
            } else if (z.equals(array[i])) {
                System.out.println(array[i] + " - данное значение имеется в константах");
                break;
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