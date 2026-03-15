package patternPrograms;

import java.util.Scanner;

// print the pattern of concatenation of two number
/*
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
6 7 8 9 10
 */
public class NumberPattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }
}
