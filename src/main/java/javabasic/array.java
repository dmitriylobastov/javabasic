package javabasic;

public class array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int number = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = number;
        int middle = array.length / 2;
        System.out.println(array[middle] + array[0]);
    }
}
