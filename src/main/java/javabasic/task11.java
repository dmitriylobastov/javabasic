package javabasic;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два целых числа.");
        System.out.println("Первое число: ");
        String number1 = Integer.toString(integer());
        System.out.println("Второе число: ");
        int number2 = integer();
        int result = Math.max(number2, Integer.parseInt(number1));
        System.out.println("Большее из двух чисел: " + result);
        double result2 = (double) Math.min(number2, Integer.parseInt(number1));
        System.out.println("Меньшее из двух чисел: " + result2);
    }

    public static int integer() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int integer = 0;
            String a = scan.nextLine();
            try {
                integer = Integer.parseInt(a);
                return integer;
            } catch (NumberFormatException ex) {
                System.out.println("Введите целое число: ");
            }
        }
    }
}