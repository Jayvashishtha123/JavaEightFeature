package com.gevernova.javaeightfeature.MethodReferenceProblems.Problem04;

public class Main {
    static void main(String[] args) {
        ShapeCreator creator = Rectangle::new;
        Rectangle rect = creator.create(10,5);
        rect.area();
    }
}
