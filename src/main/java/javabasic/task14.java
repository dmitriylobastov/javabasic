package javabasic;

import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        final int min = -20;
        final int max = 20;
        int minValue = max;
        int maxValue = min;
        for (int i = 0; i < array.length; i++) {
            array[i] = random(min, max);
        }
        for (int number : array) {
            if (number < minValue)
                minValue = number;
            if (number > maxValue)
                maxValue = number;
        }
        System.out.println("Массив из 15 элементов заполнен рандомными значениями в диапазоне от -20 до 20: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Минимальный элемент массива: " + minValue);
        System.out.println("Максимальный элемент массива: " + maxValue);
        if (Math.abs(minValue) > Math.abs(maxValue))
            System.out.println("Наибольшее по модулю из максимального и минимального: " + Math.abs(minValue));
        if (Math.abs(minValue) < Math.abs(maxValue))
            System.out.println("Наибольшее по модулю из максимального и минимального: " + Math.abs(maxValue));
        if (Math.abs(minValue) == Math.abs(maxValue))
            System.out.println("Максимальное и минимальное по модулю между собой равны: " + Math.abs(maxValue));
    }

    public static int random(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
