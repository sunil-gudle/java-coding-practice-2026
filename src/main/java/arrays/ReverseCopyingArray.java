package arrays;

import java.util.Arrays;

public class ReverseCopyingArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[arr1.length];

        for (int i = arr1.length - 1, j = 0; i >= 0; i--, j++) {
            arr2[j] = arr1[i];
        }
        for (int j : arr2)
            System.out.print(j + ", ");
    }
}
