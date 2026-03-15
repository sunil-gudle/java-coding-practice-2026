package NumberPrograms;

// Check the given number is palindrome or not

import java.util.Scanner;

public class CheckNumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter the number: ");
        int num = scanner.nextInt();

        if (isPalindrome(num))
            System.out.println("Given number is a Palindrome");
        else
            System.out.println("Given number is not a Palindrome");

    }
    static boolean isPalindrome(int n){
        int rev = 0;
        int rem, originalNum = n;
        while (n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == originalNum)
            return true;
        else
            return false;
    }
}
