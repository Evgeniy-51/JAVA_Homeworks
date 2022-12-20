// Вывести все простые числа от 1 до 1000

public class Task2 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i < Math.round(Math.sqrt(num)) + 1; i = i + 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}