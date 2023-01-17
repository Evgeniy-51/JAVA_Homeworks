import java.util.Scanner;

public class Menu {
    public static String menu(String out) {
        Scanner console = new Scanner(System.in);

        String out1 = "\nВведите критерий выбора ноутбука: \n" +
                "1 - диагональ экрана\n" +
                "2 - цвет корпуса\n" +
                "3 - тип процессора\n" +
                "4 - цена\n" +
                ".. либо другой символ для выхода";
        String out2 = "Какую диагональ экрана предпочитаете: \n" +
                "1 - менее 14'\n" +
                "2 - менее 15,6'\n" +
                "3 - от 15,6 до 17,3'\n" +
                "4 - 17,3' и более";
        String out3 = "Выберете цвет ноутбука: \n" +
                "1 - черный\n" +
                "2 - серый\n" +
                "3 - серебристый\n" +
                "4 - другой";
        String out4 = "Выберете тип процессора: \n" +
                "1 - Intel Core\n" +
                "2 - Intel Celeron\n" +
                "3 - AMD Ryzen\n" +
                "4 - другой";
        String out5 = "Из какого бюджета исходите? \n" +
                "1 - < 300$\n" +
                "2 - < 600$\n" +
                "3 - < 1000$\n" +
                "4 - 1000$ и более";

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
            case "out4":
                System.out.println(out4);
                break;
            case "out5":
                System.out.println(out5);
                break;
        }
        return console.next();
    }
}
