// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        List numList = createList();
        System.out.println(numList);

        numList.removeIf(e -> (int) e % 2 == 0);
        System.out.println(numList);
    }

    private static List createList() {
        Random rnd = new Random();
        List<Integer> lst = new LinkedList<>();
        int listSize = rnd.nextInt(10) + 10;
        for (int i = 0; i < listSize; i++) {
            lst.add(rnd.nextInt(10));
        }
        return lst;
    }
}