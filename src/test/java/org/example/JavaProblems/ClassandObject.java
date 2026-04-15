package org.example.JavaProblems;

import javax.swing.text.html.parser.TagElement;

public class ClassandObject {
    public static void main(String[] args) {
        car Tesla=new car("xuv500",3);
        Tesla.name();
        System.out.println("No.of Years"+"="+Tesla.age);
        Bike Pulsar=new Bike();
        Pulsar.Bikename="NS200";
        Pulsar.enginecc="350cc";
        Pulsar.bikedetails();
    }
}
class car{
    String name;
    int age;
    car(String name,int age){
        this.age= age;
        this.name=name;
    }
    public void name(){
        System.out.println("Car Name"+"="+name);
    }
}
class Bike{
    String Bikename;
    String enginecc;
    public void bikedetails(){
        System.out.println("BikeName"+":"+Bikename);
        System.out.println("engineCapacity"+"="+enginecc);
    }
}
