package org.example.JavaProblems;
public class numbertoletter {
    public static void main(String[] args) {
        String str = "3a4b2c";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                continue;
            }
            int repeat = 1;
            if (i > 0 && Character.isDigit(str.charAt(i - 1))) {
                repeat = str.charAt(i - 1) - '0';
            } else if (i + 1 < str.length() && Character.isDigit(str.charAt(i + 1))) {
                repeat = str.charAt(i + 1) - '0';
            }
            for (int j = 0; j < repeat; j++) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString()); // Output: aaabbbbcc
    }
}
