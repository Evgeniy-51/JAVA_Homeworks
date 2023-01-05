// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Arrays;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>(Arrays.asList("One", "Two", "Three", "Four", "Five", "Six"));

        lst = reverseList(lst);
        System.out.println(lst);
    }

    private static LinkedList<String> reverseList(LinkedList<String> lst) {
        LinkedList<String> tmp = new LinkedList<>();

        for (String elem : lst) {
            tmp.addFirst(elem);
        }
        return tmp;
    }
}