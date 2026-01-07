package NumberPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumFromListUsingCollections {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 48, 59, 29, 30, 59, 960, 984, 930, 123);

        int largest = Collections.max(numbers);

        System.out.println("Largest Number: "+ largest);
    }
}
