package com.inheritance;
//SingleInheritance.java
class Vehicle {
 public void run() {
     System.out.println("Vehicle is running...");
 }
}

class Car extends Vehicle {
 public void speed() {
     System.out.println("Car speed is 100 km/h");
 }
}

public class SingleInheritance {
 public static void main(String[] args) {
     Car myCar = new Car();
     myCar.run();    // From Vehicle
     myCar.speed();  // From Car
 }
}

