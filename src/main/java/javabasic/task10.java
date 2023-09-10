package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Операции с массивом. Матрица");
        int arraySize = arraySize();
        int [][] array = new int[arraySize][arraySize];
        System.out.println("Заполните массив целыми числами");
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[i].length; s++) {
                    array[i][s] = intInput();
            }
        }
        int[] result = new int[arraySize];
        for (int i = 0; i < array[0].length; i++) {
            result[i] = array[0][i] * 3;
        }
        System.out.println("Первая строка массива, где каждый элемент умножен на 3: " + Arrays.toString(result));
    }

    public static int intInput() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int intInput = 0;
            String a = scan.nextLine();
            try {
                intInput = Integer.parseInt(a);
                return intInput;
            } catch (NumberFormatException ex) {
                System.out.println("Введите вещественное число");
            }
        }
    }

    public static int arraySize() {
        System.out.println("Введите размер массива квадратной матрицы: ");
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