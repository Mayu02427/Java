package com.encapsulation;
//Student.java
public class Student {
 // Private fields
 private String name;
 private int age;
 private char grade;

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter for age
 public int getAge() {
     return age;
 }

 // Setter for age
 public void setAge(int age) {
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Invalid age.");
     }
 }

 // Getter for grade
 public char getGrade() {
     return grade;
 }

 // Setter for grade
 public void setGrade(char grade) {
     this.grade = grade;
 }
}
