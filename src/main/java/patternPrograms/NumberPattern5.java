package patternPrograms;
import java.util.Scanner;

// print the number pattern as below
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */

public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
