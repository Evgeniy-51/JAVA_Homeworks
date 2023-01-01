import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    String name;
    String country;
    String city;
    String age;

    public static User createUser(String row) {
        User person = new User();
        StringBuilder builder = new StringBuilder(row);
        String[] trashList = {String.valueOf('{'), String.valueOf('}'), String.valueOf('"')};
        Set trash = new HashSet();
        trash.addAll(List.of(trashList));
        builder.deleteCharAt(0);                      // Без этих двух строк не удаляются первые кавычки и последняя
        builder.deleteCharAt(builder.length() - 2);   // скобка. Причину так и не понял...
        for (int i = 0; i < builder.length(); i++) {
            if (trash.contains(String.valueOf(builder.charAt(i)))) {
                builder.deleteCharAt(i);
            }
        }
        String[] elem = builder.toString().split(",");

        for (String i : elem) {
            String[] words = i.split(":");
            switch (words[0]) {
                case "name":
                    person.name = words[1];
                case "country":
                    person.country = words[1];
                case "city":
                    person.city = words[1];
                case "age":
                    person.age = words[1];
            }
        }
        return person;
    }
}
