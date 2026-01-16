package patternPrograms;

import java.util.Scanner;

// Print the sequence of natural number till
/*
01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20
 */
public class NumberPattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleae enter the number: ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                count++;
                System.out.printf("%02d ",count);
            }
            System.out.println();
        }
    }
}
