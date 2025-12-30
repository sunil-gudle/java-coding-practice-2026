package stringPrograms;

import java.util.Scanner;

public class NumberOfCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please provide the input string: ");
        String word = scanner.nextLine();

        NumberOfCharsInString obj = new NumberOfCharsInString();
        int numOfChars = obj.numsOfCharacter(word);

        System.out.println("number of characters: " + numOfChars);
    }

    public int numsOfCharacter(String str) {
        return str.length();
    }
}
