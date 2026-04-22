package org.example.JavaProblems;

public class stringtonumber {
    public static void main(String[] args) {
        String str="aaabbccdd";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i)).append(count);
        }
        System.out.println(sb.toString());
    }
}
