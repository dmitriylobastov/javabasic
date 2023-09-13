package javabasic;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        String input = input();
        boolean s1 = input.contains("Java");
        boolean s2 = input.startsWith("I like");
        boolean s3 = input.endsWith("!!!");
        System.out.println("Cодержит ли строка подстроку “Java”: " + (s1 ? "Да" : "Нет"));
        System.out.println("Начинается ли строка с подстроки “I like“: " + (s2 ? "Да" : "Нет"));
        System.out.println("Заканчивается ли строка с подстроки “!!!”: " + (s3 ? "Да" : "Нет"));
        if (s1 & s2 & s3) {
            System.out.println("Если три “Да“, то вывести в верхнем регистре: " + input.toUpperCase());
        }
        String s4 = input.replace('a', 'o');
        System.out.println("Замена всех символов 'a' на 'o' и вывод - Jovo: " + s4.substring(7, 11));
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите: I like Java!!!");
        String s = null;
        String input = "I like Java!!!";
        while (scan.hasNext()) {
            s = scan.nextLine();
            if (s.equals("I like Java!!!")) {
                return input;
            }
            System.out.println("Введите: I like Java!!!");
        }
        return s;
    }
}