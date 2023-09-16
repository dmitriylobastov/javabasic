package javabasic;

import java.util.Scanner;

public class finaltask1 {
    public static void main(String[] args) {
        System.out.println("Конвертер долларов в рубли");
        double dollar;
        do {
            System.out.println("Введите текущий курс доллара, типа Double больше нуля: ");
            dollar = dollar();
            if (dollar >= 0.01) {
                break;
            }
        }
        while (true);
        int ruble;
        do {
            System.out.println("Введите количество рублей, целое цисло больше нуля: ");
            ruble = ruble();
            if (ruble >= 1) {
                break;
            }
        }
        while (true);
        double result = ruble / dollar;
        System.out.println("Курс доллара: " + String.format("%.2f", dollar));
        System.out.println("Количество рублей: " + ruble);
        System.out.println("Итого: " + String.format("%.2f", result) + " долларов");
    }

    public static double dollar() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double dollar = 0;
            String a = scan.nextLine();
            try {
                dollar = (Math.floor(Double.parseDouble(a) * 100)) / 100;
                return dollar;
            } catch (NumberFormatException e) {
                System.out.println("Введите текущий курс доллара, типа Double больше нуля: ");
            }
        }
    }

    public static int ruble() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int ruble = 0;
            String a = scan.nextLine();
            try {
                ruble = Integer.parseInt(a);
                return ruble;
            } catch (NumberFormatException ex) {
                System.out.println("Введите количество рублей, целое цисло больше нуля: ");
            }
        }
    }
}