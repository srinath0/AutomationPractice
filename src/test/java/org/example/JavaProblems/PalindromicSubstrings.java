package org.example.JavaProblems;
import java.util.*;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "bbbbbb";
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            while (seen.contains(ch)) {
                seen.remove(str.charAt(left));
                left++;
            }
            seen.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}
