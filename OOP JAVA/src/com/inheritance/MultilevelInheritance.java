package com.inheritance;
class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

class C extends B {
    void showC() {
        System.out.println("Class C");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.showA(); // From class A
        obj.showB(); // From class B
        obj.showC(); // From class C
    }
}
