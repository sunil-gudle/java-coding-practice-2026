package arrays;

// print two-dimensional array

public class PrintTwoDimensionalArray {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // using for loop
        for (int i =0; i < arr.length;i++){
            for (int j = 0; j < arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nBy using for-each loop");

        // using for-each loop
        for (int[] x : arr){
            for (int y : x){
                System.out.print(y + " ");
            }
            System.out.println();

        }
    }
}
