package javabasic;

import java.util.Scanner;
import java.util.Set;

public class finaltask2 {
    public static void main(String[] args) {
        System.out.println("Уравнение. Найти неизвестное ‘x‘. \nУсловие: \n- Программа принимает на вход строку длиной 5 символов \n- Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’. \n- Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. \nНапример: x+5=7 или 3-x=9 или 3-3=x");
        Scanner scan = new Scanner(System.in);
        String input = "";
        int result;
        char[] charArray;
        do {
            System.out.println("Введите уравнение, согласно условию: ");
            input = scan.nextLine().replace(" ", "");
            if (!input.equals("")) {
                if (input.length() == 5) {
                    charArray = input.toCharArray();
                    if (charArray[3] == '=') {
                        if (charArray[1] == '+') {
                            if ('x' == input.charAt(0) & 'x' != input.charAt(2) & 'x' != input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(4))) - Integer.parseInt(String.valueOf(input.charAt(2)));
                                System.out.println("x = " + result);
                                break;
                            }
                            if ('x' != input.charAt(0) & 'x' == input.charAt(2) & 'x' != input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(4))) - Integer.parseInt(String.valueOf(input.charAt(0)));
                                System.out.println("x = " + result);
                                break;
                            }
                            if ('x' != input.charAt(0) & 'x' != input.charAt(2) & 'x' == input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(2))) + Integer.parseInt(String.valueOf(input.charAt(0)));
                                System.out.println("x = " + result);
                                break;
                            }
                        }
                        if (charArray[1] == '-') {
                            if ('x' == input.charAt(0) & 'x' != input.charAt(2) & 'x' != input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(4))) + Integer.parseInt(String.valueOf(input.charAt(2)));
                                System.out.println("x = " + result);
                                break;
                            }
                            if ('x' != input.charAt(0) & 'x' == input.charAt(2) & 'x' != input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(0))) - Integer.parseInt(String.valueOf(input.charAt(4)));
                                System.out.println("x = " + result);
                                break;
                            }
                            if ('x' != input.charAt(0) & 'x' != input.charAt(2) & 'x' == input.charAt(4)) {
                                result = Integer.parseInt(String.valueOf(input.charAt(0))) - Integer.parseInt(String.valueOf(input.charAt(2)));
                                System.out.println("x = " + result);
                                break;
                            }
                        }
                    }
                }
            }
        }
        while (true);
    }
}