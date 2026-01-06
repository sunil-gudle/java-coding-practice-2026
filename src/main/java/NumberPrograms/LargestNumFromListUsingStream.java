package NumberPrograms;

import java.util.Arrays;
import java.util.List;

public class LargestNumFromListUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(38,49, 29, 49, 56, 24, 95, 46, 68);

        int largest = numbers.stream().max(Integer::compareTo).get();

        System.out.println("Largest Number: "+ largest);
    }
}
