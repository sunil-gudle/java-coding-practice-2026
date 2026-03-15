package NumberPrograms;

// Display or print the digits of the given number in reverse order

import java.util.Scanner;

public class PrintDigitsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        int rem;

        // This prints digits in reverse order
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            System.out.println(rem);
        }
    }
}
