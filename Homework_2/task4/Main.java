import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(System.in);
        String[] labels = { "1-е число:  ", "2-е число:  " };
        double[] num = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Введите %s", labels[i]);
            if (console.hasNextDouble()) {
                num[i] = console.nextDouble();
            } else {
                System.out.println("Извините, но это не число. Перезапустите программу и попробуйте снова!");
                System.exit(0);
            }
        }

        System.out.print("Какую операцию выполнить? (+ - * /)  ");
        String operation = console.next();
        console.close();

        String res = calc(operation, num[0], num[1]);
        res = (res.endsWith(".0")) ? res.substring(0, res.length() - 2) : res;
        System.out.println("Результат = " + res);
        logger(num, operation, res);
    }

    private static String calc(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                return Double.toString(num1 + num2);
            case "-":
                return Double.toString(num1 - num2);
            case "*":
                return Double.toString(num1 * num2);
            case "/":
                return (num2 != 0) ? Double.toString(num1 / num2) : "Ошибка! Деление на 0!";
            default:
                return "Некорректная операция";
        }
    }

    private static void logger(double[] num, String operation, String res) throws IOException {
        File file = new File("task4.log");
        if (!file.exists()) {
            file.createNewFile();
        }
        Writer writer = new FileWriter(file, true);
        writer.write(String.format("%s %s %s = %s\n", num[0], operation, num[1], res));
        writer.close();
    }
}