// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class task2 {
    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, Integer> hmap = new HashMap<>();

        File file = new File("list.txt");
        Scanner scann = new Scanner(file);
        while (scann.hasNextLine()) {
            String row = scann.nextLine();
            mapCreator(row, hmap);
        }
        scann.close();

        ArrayList<Integer> sortedValues = new ArrayList<>(hmap.values());
        sortedValues.sort(Comparator.reverseOrder());

        for (int count : sortedValues) {
            Iterator<HashMap.Entry<String, Integer>> it = hmap.entrySet().iterator();
            while (it.hasNext()) {
                HashMap.Entry<String, Integer> item = it.next();
                if (item.getValue().equals(count)) {
                    System.out.printf("%s: встречается %d раз(a)\n", item.getKey(), item.getValue());
                    it.remove();
                }
            }
        }
    }

    private static void mapCreator(String str, HashMap<String, Integer> hmap) {
        String[] arr = str.split(" ");
        String name = arr[0];

        if (hmap.containsKey(name)) {
            int count = hmap.get(name) + 1;
            hmap.replace(name, count);

        } else {
            hmap.put(name, 1);
        }
    }
}