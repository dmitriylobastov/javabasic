package javabasic;

import java.util.Scanner;

public class finaltask4 {
    public static void main(String[] args) {
        System.out.println("Отгадайте загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.");
        System.out.println("- Есть 3 попытки, чтобы отгадать загадку");
        System.out.println("- Доступна подсказка перед первой попыткой, но доступных попыток вместо трех станет одна");
        System.out.println("- Чтобы взять подсказку, на первой попытке введите: Подсказка");
        System.out.println("Первая попытка: ");
        String input = input();
        String [] array = {"Подсказка", "Правильно!", "Подумай еще!", "Обидно, приходи в другой раз", "Подсказка уже недоступна", "Какой-то жук, найденный в архиве", "У Вас единственная попытка: ", "Заархивированный вирус"};
        // удалить строку ->
        System.out.println(input);
        if (input.toLowerCase().contains((array[0]).toLowerCase())) {
            System.out.println(array[0] + ": " + array[5]);
            System.out.println(array[6]);
            input = input();
            if (input.toLowerCase().contains((array[7]).toLowerCase())) {
                System.out.println(array[1]);
            }
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
            System.out.println("Введите: I like Java!!!");
        return input;
    }
}
