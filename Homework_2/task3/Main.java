// Дана json строка (можно сохранить в файл и читать из файла)
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:\
// Студент [фамилия] получил [оценка] по предмету [предмет].
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("task3.json");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            String[] allTables = row.split("},\\{");
            for (String note : allTables) {
                Table student = Table.parser(note);

                StringBuilder result = new StringBuilder();
                result.append("Студент ").append(student.surname).append(" получил ").append(student.grade);
                result.append(" по предмету ").append(student.subject);
                System.out.println(result);
            }
        }
        sc.close();
    }
}