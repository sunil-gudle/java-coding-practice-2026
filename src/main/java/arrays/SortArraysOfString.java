package arrays;

import java.util.Arrays;

public class SortArraysOfString {
    public static void main(String[] args) {
        String [] arr = {"java", "python", "javascript", "html", "go"};
        Arrays.sort(arr);
        for (String x : arr)
            System.out.print(x + " ");
    }
}
