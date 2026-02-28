package arrays;

// find sum of all elements from array

public class SumOfAllElementsFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
