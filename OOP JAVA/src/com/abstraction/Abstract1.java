package com.abstraction;


//Abstract class
abstract class Animal {
// Abstract method (no body)
abstract void makeSound();

// Concrete method
void eat() {
   System.out.println("This animal eats food.");
}
}

//Subclass
class Dog extends Animal {
// Overriding the abstract method from Animal class
@Override
void makeSound() {
   System.out.println("Bark");
}
}

//Main class to run the program
public class Abstract1 {
public static void main(String[] args) {
   Dog myDog = new Dog();
   myDog.makeSound();  // Output: Bark
   myDog.eat();        // Output: This animal eats food.

   Animal mycat= new Dog();
   myDog.makeSound();
   myDog.eat();
}
}
