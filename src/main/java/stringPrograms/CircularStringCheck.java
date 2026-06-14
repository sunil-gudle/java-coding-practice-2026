package stringPrograms;

import java.util.Scanner;

public class CircularStringCheck {
    public static void main(String[] args) {
        String original = "abcdefg";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String input: ");
        String circular = scanner.nextLine();

        if (original.length() != circular.length()) {
            System.out.println("String is not circular");
            return;
        }

        String doubled = original + original;

        if (doubled.contains(circular)) {
            System.out.println("String is circular.");
        } else {
            System.out.println("Not circular");
        }
    }
}
