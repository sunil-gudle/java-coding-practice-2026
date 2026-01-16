package patternPrograms;
import java.util.Scanner;

// Program to print the below pattern for n number times
// 1 1 1 1 1
// 2 2 2 2 2
// 3 3 3 3 3

public class NumberPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
