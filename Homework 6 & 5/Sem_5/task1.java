import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> book = new HashMap<>();

        boolean isRepeat = true;
        while (isRepeat) {
            String choice = menu("out1");
            if (choice.equals("1")) {
                viewBook(book);
            } else if (choice.equals("2")) {
                String name = menu("out2");
                String tel = "";
                ArrayList<String> numbers = new ArrayList<>();
                while (!tel.equals("q")) {
                    tel = menu("out3");
                    if (!tel.equals("q")) numbers.add(tel);
                }
                book.put(name, numbers);
            } else isRepeat = false;
        }
    }

    private static String menu(String out) {
        Scanner console = new Scanner(System.in);
        String out1 = "Выберете действие:\n" +
                "1 - просмотреть книгу\n" +
                "2 - добавить запись\n" +
                ".. либо другой символ для выхода";
        String out2 = "Введите имя";
        String out3 = "Введите номер телефона или <q> для завершеня ввода";

        switch (out) {
            case "out1":
                System.out.println(out1);
                break;
            case "out2":
                System.out.println(out2);
                break;
            case "out3":
                System.out.println(out3);
                break;
        }
        return console.next();
    }


    private static void viewBook(HashMap<String, ArrayList<String>> map) {
        if (map.size() == 0) {
            System.out.println("Эта книга еще пуста :(\n");

        } else {
            for (HashMap.Entry<String, ArrayList<String>> set :
                    map.entrySet()) {
                System.out.println(set.getKey() + "  " + set.getValue().toString());
            }

            System.out.println();
        }
    }
}