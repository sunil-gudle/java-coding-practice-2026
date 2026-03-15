package arrays;

// Search element from array from unique elements

import java.util.Scanner;

public class SearchElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Please enter the searching element: ");
        int searchElement = scanner.nextInt();
        int index = indexOf(arr, searchElement);
        if (index >= 0) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int indexOf(int[] arr, int searchElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                return i;
            }
        }
        return -1;
    }
}