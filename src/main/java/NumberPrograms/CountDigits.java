package NumberPrograms;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter the number: ");
        int num = scanner.nextInt();

        int count = digitCount(num);
        System.out.println("The digit count is: " + count);

    }

    static int digitCount(int n) {
        int digit_count = 0;
        if (n == 0)
            return 1;
        while (n != 0) {
            n = n / 10;
            ++digit_count ;
        }
        return digit_count;
    }
}
