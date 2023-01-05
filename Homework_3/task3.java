// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(3, 6, 2, 9, 65, 23, 9));

        double avg = lst.get(0);
        int min = lst.get(0);
        int max = lst.get(0);

        for (int i = 1; i < lst.size(); i++) {
            avg += lst.get(i);
            min = (lst.get(i) < min) ? lst.get(i) : min;
            max = (lst.get(i) > max) ? lst.get(i) : max;
        }

        System.out.println("Исходный массив:  " + lst);
        System.out.println("Минимальное значение = " + min);
        System.out.println("Максимальное значение = " + max);
        System.out.printf("Среднее арифметическое = %.2f", avg / lst.size());
    }
}