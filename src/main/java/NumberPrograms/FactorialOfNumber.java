package NumberPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scannner.nextInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " = " + fact);
    }
}
