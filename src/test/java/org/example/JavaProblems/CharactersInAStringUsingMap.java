package org.example.JavaProblems;
import java.util.*;
public class CharactersInAStringUsingMap {
    public static void main(String[] args) {
        String str="automation";
        Map<Character,Integer> n1=new HashMap<>();
        for(char ch:str.toCharArray()){
            n1.put(ch,n1.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> result: n1.entrySet()){
            if(result.getValue()==2) {
                System.out.println(result);
            }
        }
    }
}
