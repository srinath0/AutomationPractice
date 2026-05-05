package org.example.JavaProblems;

public class FirstAndLastWord {
    public static void main(String[] args) {
        String str="My name is Java";
        String[] words=str.split(" ");
        if(words.length>2) {
            System.out.println(words[0]);
            System.out.println(words[words.length - 1]);
        }
    }
}
