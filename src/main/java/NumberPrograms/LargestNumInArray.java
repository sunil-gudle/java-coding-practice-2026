package NumberPrograms;

public class LargestNumInArray {
    public static void main(String[] args) {
        int[] numbers = {92, 13, 49, 89, 9, 38, 84};

        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i]>largest)
                largest = numbers[i];
        }
        System.out.println("Largest number from array: " + largest);
    }
}
