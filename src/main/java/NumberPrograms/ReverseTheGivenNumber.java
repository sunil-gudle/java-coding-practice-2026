package NumberPrograms;

import java.util.Scanner;

public class ReverseTheGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int num = scanner.nextInt();

        int reversedNum = reverseNumber(num);
        System.out.println("Reversed number: " + reversedNum);
    }

    static int reverseNumber(int n) {
        int revNumber = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            revNumber = revNumber * 10 + rem;
            n = n / 10;
        }
        return revNumber;
    }
}
