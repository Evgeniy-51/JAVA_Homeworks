import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("storage.txt");
        Scanner sc = new Scanner(file);
        HashMap<String, Laptop> storage = new HashMap<>();

        while (sc.hasNextLine()) {
            String row = sc.nextLine();
            String[] data = row.split("/");
            if (data.length == 8) {
                Laptop lpt = new Laptop(data[1], Double.parseDouble(data[2]), data[3], data[4],
                        Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                storage.put(data[0], lpt);
            }
        }

        boolean isRepeat = true;
        while (isRepeat) {
            String choice = Menu.menu("out1");
            if (choice.equals("1")) {
                choice = Menu.menu("out2");
                GetData.display(choice, storage);
            } else if (choice.equals("2")) {
                choice = Menu.menu("out3");
                GetData.color(choice, storage);
            } else if (choice.equals("3")) {
                choice = Menu.menu("out4");
                GetData.cpuType(choice, storage);
            } else if (choice.equals("4")) {
                choice = Menu.menu("out5");
                GetData.price(choice, storage);
            } else isRepeat = false;
        }

        sc.close();
    }



}