package NumberPrograms;

// Write a program to reverse digits of a number

import java.util.Scanner;

public class ReverseDigitsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        int reversedNumber = reverseDigits(num);
        System.out.println("Reversed Number: "+ reversedNumber);

    }
    public static int reverseDigits(int num){
        int revNum = 0;
        while (num > 0){
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum;
    }
}
