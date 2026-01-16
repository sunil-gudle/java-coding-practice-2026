package patternPrograms;

import java.util.Scanner;

// print the number pattern as below
/*
1
1 2
1 2 3
1 2 3 4
 */
public class NumberPattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
