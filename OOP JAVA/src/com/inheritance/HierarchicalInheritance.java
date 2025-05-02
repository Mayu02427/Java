package com.inheritance;
//HierarchicalInheritance.java
class Animal {
 public void eat() {
     System.out.println("Animal eats food");
 }
}

class Dog extends Animal {
 public void bark() {
     System.out.println("Dog barks");
 }
}

class Cat extends Animal {
 public void meow() {
     System.out.println("Cat meows");
 }
}

public class HierarchicalInheritance {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.eat();   // From Animal
     d.bark();  // From Dog

     Cat c = new Cat();
     c.eat();   // From Animal
     c.meow();  // From Cat
 }
}

