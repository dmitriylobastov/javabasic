package javabasic;

import java.util.Scanner;

/*
Калькулятор
Поддерживает:
-- операции только с двумя целыми числами
-- типы операций: +, -, *, /
Реализована проверка на ввод:
-- целого числа
-- символа знака операции: +, -, *, /
 */

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Калькулятор");
        System.out.println("Введите первое целое число: ");
        int numberOne = 0;
        int numberTwo = 0;
        while (true) {
            String a = scan.nextLine();
            try {
                numberOne = Integer.parseInt(a);
                break;
            } catch (NumberFormatException ex) {
                System.out.println(a + " - это не целое число, введите целое число: ");
            }
        }
        System.out.println("Введите второе целое число: ");
        while (true) {
            String b = scan.nextLine();
            try {
                numberTwo = Integer.parseInt(b);
                break;
            } catch (NumberFormatException ex) {
                System.out.println(b + " - это не целое число, введите целое число: ");
            }
        }
        System.out.println("Введите тип операции, символ ‘+’, ‘-’, ‘*’ или ‘/’: ");
        int result = 0;
        char symbol = ' ';
        String[] string1 = {"+", "-", "*", "/"};
        while (scan.hasNext()) {
            String s = scan.nextLine();
            boolean yes = false;
            for (int i = 0; i < string1.length; i++) {
                yes = !s.equalsIgnoreCase(string1[i]);
                if (yes == false)
                    break;
            }
            if (yes) {
                System.out.println(symbol + " - это не знак операции. Введите тип операции, символ ‘+’, ‘-’, ‘*’ или ‘/’: ");
            } else {
                symbol = s.charAt(0);
                switch (symbol) {
                    case '+':
                        result = numberOne + numberTwo;
                        break;
                    case '-':
                        result = numberOne - numberTwo;
                        break;
                    case '*':
                        result = numberOne * numberTwo;
                        break;
                    case '/':
                        result = numberOne / numberTwo;
                        break;
                }
                break;
            }
        }
        scan.close();
        System.out.print("Результат: ");
        System.out.print(numberOne + " ");
        System.out.print(symbol + " ");
        System.out.print(numberTwo + " = ");
        System.out.println(result);
    }
}