package javabasic;

import java.util.Scanner;

public class finaltask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfLines;
        do {
            System.out.println("Введите количество строк: ");
            numberOfLines = numberOfLines();
        } while (numberOfLines < 1);
        String[] input = new String[numberOfLines];
        for (int i = 0; i < input.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            input[i] = scan.nextLine();
        }
        System.out.println("Количество строк: " + numberOfLines);
        for (int i = 0; i < input.length; i++) {
            System.out.println("Строка " + (i + 1) + ": " + input[i]);
        }
        int[] uniqueCharacters = new int[numberOfLines];
        for (int i = 0; i < uniqueCharacters.length; i++) {
            uniqueCharacters[i] = countUniqueCharacters(input[i]);
        }
        int maxCountUniqueCharacters = 0;
        for (int i = 0; i < numberOfLines; i++) {
            if (i == 0) {
                continue;
            }
            if (uniqueCharacters[i] > uniqueCharacters[i - 1]) {
                maxCountUniqueCharacters = i;
            }
        }
        System.out.println("Cтрока с максимальным количеством различных символов. Ответ: " + input[maxCountUniqueCharacters]);
    }

    public static int numberOfLines() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int numberOfLines = 0;
            String a = scan.nextLine();
            try {
                numberOfLines = Integer.parseInt(a);
                return numberOfLines;
            } catch (NumberFormatException ex) {
                System.out.println("Введите целое число больше нуля: ");
            }
        }
    }

    public static int countUniqueCharacters(String input) {
        String unique = input.replaceAll("(.)(?=.*?\\1)", "");
        return unique.length();
    }
}