package arrays;

// insert an element in an array

public class InsertionOfElementInArray {
    public static void main(String[] args) {

        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int currentSize = 6;
        for (int i = 0; i < currentSize; i++)
            System.out.print(arr[i] + " ");
        System.out.println();

        int pos = 3;
        int element = 10;
        if (currentSize >= arr.length || pos < 0 || pos > currentSize) {
            System.out.println("Invalid position or no space");
        } else {
            for (int i = currentSize; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = element;
            currentSize++;
            for (int i = 0; i < currentSize; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
