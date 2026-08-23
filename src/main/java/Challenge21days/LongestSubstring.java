package Challenge21days;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Longest Substring Without Repeating Characters
// Given a string, find the longest substring containing no duplicate characters.
//Input:  "abcabcbb"
//Output: 3

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the String: ");
        String input = scanner.nextLine();
        lengthOfLongestSubstring(input);

    }

    public static void lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        List<String> results = new ArrayList<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }

            lastSeen.put(c, right);
            int currentLength = right - left + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                results.clear();
                results.add(s.substring(left, right + 1));
            } else if (currentLength == maxLength) {
                results.add(s.substring(left, right + 1));

            }

        }
        System.out.println("Length: " + maxLength);
        System.out.println("Substring(s): " + results);
    }
}
