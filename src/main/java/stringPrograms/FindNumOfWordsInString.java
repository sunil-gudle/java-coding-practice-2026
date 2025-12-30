package stringPrograms;

import java.util.Scanner;

// find the number of words in given string

public class FindNumOfWordsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();

        String[] words = str.split("\\s");
        System.out.println(words.length);

    }
}
