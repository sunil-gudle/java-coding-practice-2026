package stringPrograms;
import java.util.Scanner;

// remove extra spaces from the given string

public class RemoveExtraSpacesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        System.out.println(str.replaceAll("\\s+", " ").trim());

    }
}
