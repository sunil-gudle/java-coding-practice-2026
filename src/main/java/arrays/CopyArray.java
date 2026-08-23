package arrays;

import java.util.Arrays;

// copy array A into array B

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j : arr1)
            System.out.print(j + ", ");
        System.out.println();
        // printing using toString() method
        System.out.println(Arrays.toString(arr1));

        // copied using copyOf() method
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        for (int j : arr2)
            System.out.print(j + ", ");
        System.out.println();

        // copied using for loop
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        for (int j : arr2)
            System.out.print(j + ", ");
    }
}
