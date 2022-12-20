// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num;
        String inp;

        while (true) {
            System.out.print("Введите число N (или <ENTER> для выхода):  ");
            inp = console.nextLine();
            if (inp.isEmpty())
                System.exit(0);
            try {
                num = Integer.parseInt(inp);
                tringle(num);
                factorial(num);
            } catch (NumberFormatException ne) {
                System.out.println("Вы ввели не число!");
            }
        }
    }

    private static void tringle(int num) {
        int sum = 0;
        for (int i = 1; i < num + 1; i++)
            sum += i;
        System.out.println("Треугольное число от " + num + " = " + sum);
    }

    private static void factorial(int num) {
        int fact = 1;
        for (int i = 2; i < num + 1; i++)
            fact *= i;
        System.out.println("Факториал от " + num + " = " + fact);
    }
}