package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        System.out.println("Проверка на наличие в строке слов, состоящих только из латиницы.");
        Scanner scan = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Введите строку из слов, разделенных пробелами: ");
            input = scan.nextLine();
            if (!input.equals("")) {
                break;
            }
        }
        while (true);
        String[] noSpaces = input.split(" ");
        int count = 0;
        String[] latin = new String[noSpaces.length];
        for (String noSpace : noSpaces) {
            if (noSpace.matches("[a-zA-Z]+")) {
                latin[count] = noSpace;
                count++;
            }
        }
        String[] noNullLatin = Arrays.copyOf(latin, count);
        if (count != 0) {
            System.out.println("Cлова, состоящие только из латиницы: ");
        }
        for (String s : noNullLatin) {
            System.out.println(s);
        }
        System.out.println("Количество слов, состоящих только из латиницы: " + count);
    }
}