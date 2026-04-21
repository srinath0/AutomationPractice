package org.example.JavaProblems;

public class numbertoletter2 {
    public static void main(String[] args){
        String str="3a4b2c";
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<str.length();j+=2){
            char ch = str.charAt(j+1);
            int repeat=Character.getNumericValue(str.charAt(j));
            sb.append(String.valueOf(ch).repeat(repeat));
        }
        System.out.println(sb.toString());
    }
}
