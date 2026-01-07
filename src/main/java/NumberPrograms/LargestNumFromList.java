package NumberPrograms;

import java.util.Arrays;
import java.util.List;

public class LargestNumFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 74, 11, 139, 37, 92, 46, 86);

        int largest = numbers.get(0);

        for (int num : numbers) {
            if (num > largest)
                largest = num;
        }

        System.out.println("Largest Number from list: " + largest);
    }
}
