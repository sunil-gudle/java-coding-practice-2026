package NumberPrograms;

// Check given number is armstrong or not

import java.util.Scanner;

public class CheckGivenNumIsArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");

        int num = scanner.nextInt();
        int digits = String.valueOf(num).length();
        int originalNum = num, rem;
        double sum = 0;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum + Math.pow(rem, digits);
        }
        if (sum == originalNum)
            System.out.println("Given number is Armstrong.");
        else
            System.out.println("Given number is not a Armstrong.");
    }
}
