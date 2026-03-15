package arrays;

// find max/largest element from array

public class FindMaxElementFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 3, 46, 86, 98, 61, 76, 99, 37, 26};
        System.out.println(maxElement(arr));
    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
