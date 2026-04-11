package org.example.Tests;

public class StringPracticeProblem {
    public static void main(String[] args){
                String str="This is not the way to do programming"; //iT i tn et yw t d gimrop
                String[] words=str.split(" ");
                StringBuilder sb=new StringBuilder();
                for(String word:words){
                    String result="";
                    StringBuilder reversedWord=new StringBuilder();
                    for(int i=0;i<word.length();i+=2){
                        result+=word.charAt(i);
                    }
                    sb.append(reversedWord.append(result).reverse().append(" "));
                }
                System.out.println(sb);
            }
        }
