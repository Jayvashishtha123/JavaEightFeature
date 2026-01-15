package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem04;

public class Rectangle {
    int length,breadth;

    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    void area(){
        System.out.println("Area: " + (length*breadth));
    }
}
