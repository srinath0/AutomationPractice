package org.example.JavaProblems;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1="done";
        String str2="eodn";
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Is Not Anagram");
        }
    }
}
