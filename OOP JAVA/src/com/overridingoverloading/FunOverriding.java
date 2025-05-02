package com.overridingoverloading;
//Parent class
class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class Cat
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }

 void color() {
     System.out.println("Cat is white");
 }
}

//Child class Dog
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }

 void color() {
     System.out.println("Dog is brown");
 }
}

//Main class to run the program
public class FunOverriding {
 public static void main(String[] args) {
    /* Animal a1 = new Cat();
     Animal a2 = new Dog();

     a1.makeSound(); // Output: Cat meows
     a2.makeSound(); // Output: Dog barks

     // Downcasting to access color() method
     ((Cat) a1).color(); // Output: Cat is white
     ((Dog) a2).color(); // Output: Dog is brown
     */
      Cat obj =new Cat();
      
      obj.color();
      obj.makeSound();
      
      Animal obj1 = new Animal();
      obj1.makeSound();
      
 }
}
