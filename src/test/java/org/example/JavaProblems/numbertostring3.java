package org.example.JavaProblems;

public class numbertostring3 {
    public static void main(String[] args) {
        String str = "A1n2ki2a0aa1";    // expected: Annkikiaa
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            StringBuilder stringPart = new StringBuilder();
            while (i < str.length() && Character.isLetter(str.charAt(i))) {
                stringPart.append(str.charAt(i));
                i++;
            }
            int repeat = 1;
            if (i < str.length() && Character.isDigit(str.charAt(i))) {
                repeat = str.charAt(i) - '0';
                i++;
            }
            for (int j = 0; j < repeat; j++) {
                sb.append(stringPart);
            }
        }
        System.out.println(sb.toString());
    }
}

