package Challenge21days;

import java.util.HashMap;

/*
 2. Minimum Window Substring
 Find the smallest substring of s containing all characters of t
 Input:
    s = "ADOBECODEBANC"
    t = "ABC"
 Output:
    "BANC"

Sliding window + frequency map.
 */

public class MinWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) return "";

        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        int required = need.size();   // distinct chars that must be satisfied
        int formed = 0;               // distinct chars currently satisfied

        int left = 0;
        int bestLen = Integer.MAX_VALUE;
        int bestLeft = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // window is valid -> try shrinking from the left
            while (formed == required) {
                if (right - left + 1 < bestLen) {
                    bestLen = right - left + 1;
                    bestLeft = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
                    formed--;
                }
                left++;
            }
        }

        return bestLen == Integer.MAX_VALUE ? "" : s.substring(bestLeft, bestLeft + bestLen);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); // BANC
    }
}