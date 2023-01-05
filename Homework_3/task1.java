// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] array = {51, 1, 8, 93, 3, 5, 8, 7, 2, 0, 4};
        int[] resArr = splitArr(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(resArr));
    }

    public static int[] splitArr(int[] arr) {
        int lenArr = arr.length;

        if (lenArr < 2) {
            return arr;
        }

        int[] arr1 = new int[lenArr / 2];
        int[] arr2 = new int[lenArr - lenArr / 2];

        System.arraycopy(arr, 0, arr1, 0, lenArr / 2);
        System.arraycopy(arr, lenArr / 2, arr2, 0, lenArr - lenArr / 2);

        return merge(splitArr(arr1), splitArr(arr2));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] res = new int[len1 + len2];
        int cur1 = 0;
        int cur2 = 0;
        int curRes = 0;

        while (cur1 < len1 && cur2 < len2) {
            if (arr1[cur1] <= arr2[cur2]) {
                res[curRes] = arr1[cur1];
                cur1++;
            } else {
                res[curRes] = arr2[cur2];
                cur2++;
            }
            curRes++;
        }
        while (cur1 < len1) {
            res[curRes] = arr1[cur1];
            cur1++;
            curRes++;
        }
        while (cur2 < len2) {
            res[curRes] = arr2[cur2];
            cur2++;
            curRes++;
        }
        return res;
    }
}