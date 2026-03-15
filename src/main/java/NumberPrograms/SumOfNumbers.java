package NumberPrograms;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of " + num + " number = " + sum);
    }
}
