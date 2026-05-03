package org.example.JavaProblems;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "()[]}";
        boolean isBalanced = checkBalanced(str);
        if (isBalanced) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
    public static boolean checkBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == ']' && top != '[') ||
                        (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

