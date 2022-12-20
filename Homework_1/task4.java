// *+Задано уравнение вида q + w = e, q, w, e >= 0.
//  Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
//  Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import static java.lang.Character.compare;
import static java.lang.Character.isDigit;

public class task4 {
    public static void main(String[] args) {
        // String expr = "2? + ?5 = 69";
        // String expr = "?23+?5= 148";
        String expr = "1?24 + 1?5 = 1359";

        String[] eqResArr = expr.split("=");
        int eqRes = Integer.parseInt(eqResArr[1].trim()); // получение результата уравнения

        String[] argsArr = eqResArr[0].split("\\+");
        char x = '\u003F';
        int[] argSum = { 0, 0 };
        int[] mults = { 1, 1 };
        for (int i = 0; i < 2; i++) {
            argsArr[i] = argsArr[i].trim();
            int digits = argsArr[i].length();
            for (int j = 0; j < digits; j++) {
                if (isDigit(argsArr[i].charAt(j))) {
                    argSum[i] += Integer.parseInt(String.valueOf(argsArr[i].charAt(j))) * Math.pow(10, digits - j - 1);
                } else if (argsArr[i].charAt(j) == x) {
                    mults[i] *= Math.pow(10, digits - j - 1);
                }
            }
        }

        int[] res = new int[2]; // получение неизвестных цифр
        boolean isRes = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((argSum[0] + i * mults[0]) + (argSum[1] + j * mults[1]) == eqRes) {
                    res[0] = i;
                    res[1] = j;
                    isRes = true;
                }
            }
        }
        if (isRes) {
            StringBuilder resStr = new StringBuilder();
            int k = 0;
            for (int i = 0; i < expr.length(); i++) {
                if (expr.charAt(i) != x) {
                    resStr.append(expr.charAt(i));
                } else {
                    resStr.append(res[k]);
                    k++;
                }
            }
            System.out.println(resStr.toString());
        } else
            System.out.println("Нет решения");
    }
}
