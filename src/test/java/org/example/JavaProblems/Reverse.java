package org.example.JavaProblems;

public class Reverse {
    public static void main(String[] args) {
        String str="I Love Automation"; //n oita motuAevoLI
        char[] characters=str.toCharArray();
        int left=0;
        int right=characters.length-1;
        while(left<right){
            if(characters[left]==' '){
                left++;
            }else if(characters[right]==' '){
                right--;
            }else{
                char temp=characters[left];
                characters[left]=characters[right];
                characters[right]=temp;
                left++;
                right--;
            }
        }
        System.out.println(String.valueOf(characters));
    }
}
