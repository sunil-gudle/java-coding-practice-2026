package NumberPrograms;

// Find the GCD of given numbers

import java.util.Scanner;

public class GreatestCommonDevisorGCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please eneter the numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Highest common devisor: "+highestCommonDevisor(x, y));
    }
    public  static int highestCommonDevisor(int x, int y){

        while (x!=y){
            if (x>y)
                x=x-y;
            else
                y = y-x;
        }
        return x;
    }
}
