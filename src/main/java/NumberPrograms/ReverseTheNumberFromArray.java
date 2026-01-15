package NumberPrograms;

// reverse the number from array using for loop

public class ReverseTheNumberFromArray {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        int arrLength = num.length;
        int[] rev = new int[num.length];

        for (int i = 0; i < arrLength; i++) {
            rev[i] = num[arrLength - 1 - i];
        }
        for (int ne : rev)
            System.out.print(ne + " ");
    }
}
