package org.example.JavaProblems;

public class NoOfCharactersInanArray {
    public static void main(String[] args){
        int[] arr={1,3,5,7,6,5,3,4,7};
        boolean[] isvisited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int count=1;
            if(isvisited[i]){
                continue;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    isvisited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+"="+count);
        }

    }
}
