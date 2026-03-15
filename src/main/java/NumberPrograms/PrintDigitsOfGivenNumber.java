package NumberPrograms;

import java.util.Scanner;

// Print the digits of the given number in original order

public class PrintDigitsOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        String s = String.valueOf(num);

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
