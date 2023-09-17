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
        int numberOne = integer();
        System.out.println("Введите второе целое число: ");
        int numberTwo = integer();
        System.out.println("Введите тип операции, символ ‘+’, ‘-’, ‘*’ или ‘/’: ");
        int result = 0;
        char symbol = ' ';
        other:
        while (scan.hasNext()) {
            String s = scan.nextLine().replace(" ", "");
            if (s.equals("")) {
                continue;
            }
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
                default:
                    System.out.println(symbol + " - это не знак операции. Введите тип операции, символ ‘+’, ‘-’, ‘*’ или ‘/’: ");
                    continue other;
            }
            break;
        }
        scan.close();
        System.out.print("Результат: ");
        System.out.print(numberOne + " ");
        System.out.print(symbol + " ");
        System.out.print(numberTwo + " = ");
        System.out.println(result);
    }

    public static int integer() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int integer = 0;
            String a = scan.nextLine().replace(" ", "");
            if (a.equals("")) {
                continue;
            }
            try {
                integer = Integer.parseInt(a);
                return integer;
            } catch (NumberFormatException ex) {
                System.out.println(a + " - это не целое число, введите целое число: ");
            }
        }
    }
}