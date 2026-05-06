package org.example.JavaProblems;

import java.util.Scanner;

public class MoveAllZeroestoEndofanArray {
    public static void main(String args[]) {
        int[] arr={2,3,0,5,4,0,0,6};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }while(j<arr.length){
            arr[j]=0;
            j++;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
