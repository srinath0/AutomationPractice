package org.example.JavaProblems;

public class polymorphims {
    public static void main(String[] args) {
        methodOverloading mathOperations = new methodOverloading();
        mathOperations.add(2,3);
        mathOperations.add("sri","nath");
        mathOperations.add(3.40,6.72);
        instance check1=new instance();
        check1.bhk3();
        check1.bhk2();
        parent check2=new parent();
        check2.bhk2();
    }
}
class methodOverloading{
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(String c, String d){
        System.out.println(c+d);
    }
    void add(double e,double f){
        System.out.println(e+f);
    }
}
class parent{
    void bhk2() {
        System.out.println("parent's 2bhk");
    }
}
class instance extends parent{
    void bhk3(){
        System.out.println("child's bhk3");
    }
    @Override
    void bhk2(){
        System.out.println("parent's -> child bhk4");
    }
}