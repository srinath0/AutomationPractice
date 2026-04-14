package org.example.JavaProblems;

public class ReverseAString {
    public static void main(String[] args) {
        String str="srinath";
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            result+=ch;
        }
        System.out.println(result);
    }
}
