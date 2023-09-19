package javabasic;

import java.util.Scanner;

public class finaltask4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.");
        System.out.println("- есть 3 попытки, чтобы отгадать загадку");
        System.out.println("- доступна подсказка перед первой попыткой, но доступных попыток вместо трех станет одна");
        System.out.println("- чтобы взять подсказку, на первой попытке введите: Подсказка");
        String input;
        int counter = 3;
        String[] array = {"Подсказка", "Правильно!", "Подумай еще!", "Обидно, приходи в другой раз", "Подсказка уже недоступна", ": Какой-то жук, найденный в архиве", "Заархивированный вирус"};
        while (counter > 0) {
            System.out.println("Осталось попыток: " + counter + ". Введите ответ: ");
            input = input();
            if (input.toLowerCase().contains((array[0]).toLowerCase())) {
                if (counter == 3) {
                    System.out.println(array[0] + array[5]);
                    counter = 1;
                } else {
                    System.out.println(array[4]);
                }
                continue;
            }
            if (input.toLowerCase().contains((array[6]).toLowerCase())) {
                System.out.println(array[1]);
                break;
            }
            if (!input.toLowerCase().contains((array[6]).toLowerCase())) {
                counter--;
                if (counter > 0) {
                    System.out.println(array[2]);
                    continue;
                }
            }
            System.out.println(array[3]);
        }
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        String input = null;
        while (scan.hasNext()) {
            input = scan.nextLine();
            if (input.equals("")) {
                continue;
            }
            return input;
        }
        return input;
    }
}
