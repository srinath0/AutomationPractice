package org.example.JavaProblems;

public class CodeToCheckAlphaNumeric {
    public static void main(String[] args) {
        String str="sri123nath";
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(Character.isDigit(ch)){
                System.out.println("Numeric"+"="+ch);
            } else if (Character.isLetter(ch)) {
                System.out.println("Alphabet"+"="+ch);
            }else{
                System.out.println("Check the character");
            }
        }
    }
}
