package javabasic;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        double average = (x + y + z) / 3.0;
        System.out.println(average);
        int result = (int) Math.floor(average / 2);
        if (result > 3)
            System.out.println("Программа выполнена корректно");
        scan.close();
    }
}