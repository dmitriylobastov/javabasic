package javabasic;

import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        System.out.println("Конвертер физических величин");
        System.out.println("Принимаются к вводу только целые числа");
        System.out.println("Чтобы конвертировать массу введите - 1, конвертировать расстояние введите - 2: ");
        int massOrDistance = massOrDistance();
        if (massOrDistance == 2)
            distanceResult();
        else if (massOrDistance == 1) {
            massResult();
        }
    }

    public static int mass() {
        System.out.println("Введите: 1, чтобы выбрать килограммы, 2, чтобы выбрать граммы: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int mass = 0;
            String a = scan.nextLine();
            try {
                mass = Integer.parseInt(a);
                boolean number = mass == 1 || mass == 2;
                if (number)
                    return mass;
                else
                    System.out.println("Введите 1 или 2: ");
            } catch (NumberFormatException ex) {
                System.out.println("Введите 1 или 2: ");
            }
        }
    }

    public static void massResult() {
        int mass = mass();
        int number = number();
        switch (mass) {
            case 1:
                System.out.println("Результат конвертирования килограммы в: ");
                System.out.println("Килограммы: " + number);
                System.out.println("Граммы: " + number / 1000.000);
                break;
            case 2:
                System.out.println("Результат конвертирования граммы в: ");
                System.out.println("Килограммы: " + number / 1000.000);
                System.out.println("Граммы: " + number);
                break;
        }
    }

    public static void distanceResult() {
        int distance = distance();
        int number = number();
        switch (distance) {
            case 1:
                System.out.println("Результат конвертирования метры в: ");
                System.out.println("Метры: " + number);
                System.out.println("Мили: " + number * 0.0062);
                System.out.println("Ярды: " + number * 1.09);
                System.out.println("Футы: " + number * 3.28);
                break;
            case 2:
                System.out.println("Результат конвертирования мили в: ");
                System.out.println("Метры: " + number * 1609.34);
                System.out.println("Мили: " + number);
                System.out.println("Ярды: " + number * 1760);
                System.out.println("Футы: " + number * 5280);
                break;
            case 3:
                System.out.println("Результат конвертирования ярды в: ");
                System.out.println("Метры: " + number * 0.91);
                System.out.println("Мили: " + number * 0.00057);
                System.out.println("Ярды: " + number);
                System.out.println("Футы: " + number * 3);
                break;
            case 4:
                System.out.println("Результат конвертирования футы в: ");
                System.out.println("Метры: " + number * 0.3);
                System.out.println("Мили: " + number * 0.00019);
                System.out.println("Ярды: " + number * 0.33);
                System.out.println("Футы: " + number);
                break;
        }
    }

    public static int number() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите число: ");
        while (true) {
            String a = scan.nextLine();
            try {
                return number = Integer.parseInt(a);
            } catch (NumberFormatException ex) {
                System.out.println(a + " - это не целое число, введите целое число: ");
            }
        }
    }

    public static int distance() {
        System.out.println("Введите: 1, чтобы выбрать метры, 2, чтобы выбрать мили, 3, чтобы выбрать ярды, или 4, чтобы выбрать футы: ");
        Scanner scan = new Scanner(System.in);
        while (true) {
            int distance = 0;
            String a = scan.nextLine();
            try {
                distance = Integer.parseInt(a);
                boolean number = distance == 1 || distance == 2 || distance == 3 || distance == 4;
                if (number)
                    return distance;
                else
                    System.out.println("Введите 1, 2, 3 или 4: ");
            } catch (NumberFormatException ex) {
                System.out.println("Введите 1, 2, 3 или 4: ");
            }
        }
    }

    public static int massOrDistance() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int massOrDistance = 0;
            String a = scan.nextLine();
            try {
                massOrDistance = Integer.parseInt(a);
                boolean number = massOrDistance == 1 || massOrDistance == 2;
                if (number)
                    return massOrDistance;
                else
                    System.out.println("Введите 1 или 2: ");
            } catch (NumberFormatException ex) {
                System.out.println("Введите 1 или 2: ");
            }
        }
    }
}