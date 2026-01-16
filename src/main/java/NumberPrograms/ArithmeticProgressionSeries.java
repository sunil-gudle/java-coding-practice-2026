package NumberPrograms;

import java.util.Scanner;

// Program to print the AP Series e.g. AP = a, a + d, a + 2d, a + 3d, ...
// Formula: AP = a, a + d, a + 2d, a + 3d, ...

public class ArithmeticProgressionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("AP Series:");
        for (int i = 0; i<n; i++){
            System.out.print(a + " ");
            a = a + d;
        }
    }
}
