package NumberPrograms;

public class LargestOfThreeNum {
    public static void main(String[] args) {
        int a = 100, b = 21, c = 75;

        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Largest number is: " + largest);
    }
}
