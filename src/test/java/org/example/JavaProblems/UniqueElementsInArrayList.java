package org.example.JavaProblems;

import java.util.*;

public class UniqueElementsInArrayList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(4);
        Set<Integer> set=new TreeSet<>(list);
        List<Integer> list1=new ArrayList<>(set);
        System.out.println(list1);
//        for(int num:list){
//            if(list.contains(num)){
//                System.out.println(num);
//            }
//        }
    }
}
