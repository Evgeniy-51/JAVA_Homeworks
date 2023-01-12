// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.

import java.util.ArrayList;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        run(1);
    }

    private static void run(int count) {
        Random rnd = new Random();
        ArrayList<Integer> board = new ArrayList<>();

        System.out.println("Попытка № " + count);
        board.add(rnd.nextInt(8));
        view(board.get(0));

        for (int i = 1; i < 8; i++) {
            int position = getPos(i, board);
            if (position != -1) {
                board.add(position);
                view(position);
            } else {
                run(++count);
            }
        }
        System.out.println("УРА!!!   ПОЛУЧИЛОСЬ!!!");
        System.exit(0); // почему без этой строки программа завершается с ошибкой???
    }

    private static Integer getPos(int row, ArrayList<Integer> board) {
        Random rnd = new Random();
        ArrayList<Integer> trash = new ArrayList<>();
        int curr = 0;

        while (trash.size() < 8) {
            boolean flag = true;
            curr = rnd.nextInt(8);

            if (!trash.contains(curr)) {
                for (int i = 0; i < row; i++) {
                    if (board.get(i) == curr || Math.abs(i - row) == Math.abs(board.get(i) - curr)) {
                        trash.add(curr);
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    return curr;
            }
        }
        return -1;
    }

    private static void view(int pos) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            if (i != pos) {
                line.append("*  ");
            } else {
                line.append("Q  ");
            }
        }
        System.out.println(line);
    }
}