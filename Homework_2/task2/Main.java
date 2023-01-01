// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();

        File file = new File("task2.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        Writer writer = new FileWriter(file);

        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(20));
        }
        System.out.println("Исходный:   " + numbers);
        writer.write("    " + numbers + "\n");

        int k = 0;
        int temp;
        boolean flag = true;
        int count = 0;

        while (flag) {
            flag = false;
            for (int i = 0; i < numbers.size() - 1 - k; i++) {
                if (numbers.get(i) > numbers.get(i + 1)) {
                    flag = true;
                    temp = numbers.get(i);
                    numbers.set(i, numbers.get(i + 1));
                    numbers.set(i + 1, temp);
                    writer.write(++count + " - " + numbers + "\n");
                }
            }
            k++;
        }
        System.out.println("Результат:  " + numbers);
        writer.close();
    }
}