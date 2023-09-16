package javabasic;

import java.util.Arrays;
import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку из слов, разделенных пробелами: ");
        String input = scan.nextLine();
        String[] noSpaces = input.split(" ");
        int count = 0;
        String[] latin = new String[noSpaces.length];
        for (int i = 0; i < noSpaces.length; i++) {
            if(noSpaces[i].matches("[a-zA-Z]+")) {
                latin [count] = noSpaces[i];
                count++;
            }
        }
        String [] noNullLatin = Arrays.copyOf(latin, count);
        System.out.println("Cлова, состоящие только из латиницы: ");
        for(String s : noNullLatin) {
            System.out.println(s);
        }
        System.out.println("Количество слов, состоящих только из латиницы: " + count);
    }
}