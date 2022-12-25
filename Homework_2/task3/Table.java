import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Table {
    String surname;
    String grade;
    String subject;

    public static Table parser(String row) {
        Table person = new Table();
        StringBuilder builder = new StringBuilder(row);
        String[] trashList = {String.valueOf('{'), String.valueOf('}'), String.valueOf('"'), String.valueOf('['), String.valueOf(']')};
        HashSet trash = new HashSet();
        trash.addAll(List.of(trashList));

        for (int i = 0; i < builder.length(); i++) {                    //////////////////////////////
            if (trash.contains(String.valueOf(builder.charAt(i)))) {    //////////////////////////////
                builder.deleteCharAt(i);                                //////////////////////////////
            }
        }
        for (int i = 0; i < builder.length(); i++) {                   // Так и не понял, почему после первого прохода
            if (trash.contains(String.valueOf(builder.charAt(i)))) {   // не удаляются первая и последняя фигурная скобка.
                builder.deleteCharAt(i);                               // Просидел две ночи, ответа так и не нашел...
            }
        }

        String[] elem = builder.toString().split(",");

        for (String i : elem) {
            String[] words = i.split(":");

            switch (words[0]) {
                case "фамилия":
                    person.surname = words[1];
                case "оценка":
                    person.grade = words[1];
                case "предмет":
                    person.subject = words[1];
            }
        }
        return person;
    }
}
