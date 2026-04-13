package org.example.JavaProblems;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String str = "I am back";
        StringBuilder sb = new StringBuilder();
        String[] words=str.split(" ");
        for(String word:words){
            StringBuilder reversedWord=new StringBuilder(word);
            sb.append(reversedWord.reverse()).append(" ");
        }
        System.out.println(sb.toString());
    }
}