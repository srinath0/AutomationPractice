package org.example.JavaProblems;

public class Inheritance {
    public static void main(String[] args) {
        child home=new child();
        home.bhk3();
        home.bhk2();
    }
}
class father{
    void bhk2(){
        System.out.println("Father's 2bhk");
    }
}
class child extends father{
    void bhk3(){
        System.out.println("children's 3bhk");
    }
}
