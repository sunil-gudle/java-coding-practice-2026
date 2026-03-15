package patternPrograms;

// Print the pattern of 1 2 3 4 5 6... for n number of times

import java.util.Scanner;

public class NestedForLoop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
