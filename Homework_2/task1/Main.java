import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("list.json");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            User student = User.createUser(row);

            StringBuilder sqlReq = new StringBuilder();
            sqlReq.append("SELECT * FROM students WHERE ");
            if (!(student.name).equals("null")){
                sqlReq.append(String.format("name='%s' ", student.name));
            }
            if (!(student.country).equals("null")){
                sqlReq.append(String.format("AND country='%s' ", student.country));
            }
            if (!(student.city).equals("null")){
                sqlReq.append(String.format("AND city='%s' ", student.city));
            }
            if (!(student.age).equals("null")){
                sqlReq.append(String.format("AND age='%s' ", student.age));
            }

            System.out.println(row);
            System.out.println(sqlReq);
            System.out.println();
        }
        sc.close();
    }
}