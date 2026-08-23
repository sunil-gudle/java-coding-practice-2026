package Challenge21days;

import java.util.*;

/* Group Anagrams
Input:
["eat","tea","tan","ate","nat","bat"]

Output:
[
  ["eat","tea","ate"],
  ["tan","nat"],
  ["bat"]
]

Sorted-String Key
Sort each string's characters to create a canonical key. All anagrams share the same sorted form (e.g., "eat", "tea", "ate" → "aet").
*/

public class GroupAnagrams {
    // Approach 1: Sorted-string key
    // Time:  O(n * k log k)   where n = number of strings, k = max string length
    // Space: O(n * k)
    public static List<List<String>> groupAnagramsSortedKey(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);   // canonical key

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagramsSortedKey(strs);
        System.out.println(result);
    }
}
