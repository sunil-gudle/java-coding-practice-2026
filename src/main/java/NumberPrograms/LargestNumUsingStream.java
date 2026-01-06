package NumberPrograms;

import java.util.Arrays;

public class LargestNumUsingStream {
    public static void main(String[] args) {
        int[] numbers = {64, 46, 57, 93, 47, 38, 67, 183};

        int largest = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Largest Number using stream: "+ largest);
    }
}
