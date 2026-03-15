package arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 4, 8, 11, 9, 10, 1, 7, 3};
        int secondLargest = secondLargest(arr);
        System.out.println("Second largets number: " + secondLargest);
    }

    public static int secondLargest(int[] arr) {
        int first = arr[0];
        int second = arr[0];

        for (int j : arr)
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second) {
                second = j;
            }
        return second;
    }

}
