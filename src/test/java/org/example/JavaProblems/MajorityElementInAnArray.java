package org.example.JavaProblems;

public class MajorityElementInAnArray {
    public static void main(String[] args) {
        int[] arr={3, 2, 3, 1, 3, 3, 2};
        int n=arr.length;
        int candidate=-1;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                        count++;
                }
            }
            if(count>n/2){
                candidate=arr[i];
                break;
            }
        }
        System.out.println(candidate);
    }
}
