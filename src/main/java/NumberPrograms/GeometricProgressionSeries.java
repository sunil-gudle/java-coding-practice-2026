package NumberPrograms;

import java.util.Scanner;

// Print the GP series
// Formula: GP = a, a·r, a·r², a·r³, ...

public class GeometricProgressionSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("GP Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a = a * r;
        }
    }
}
