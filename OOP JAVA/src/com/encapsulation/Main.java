
package com.encapsulation;

//Main.java
public class Main {
 public static void main(String[] args) {
     Student student = new Student();

     student.setName("Mayuri");
     student.setAge(21);
     student.setGrade('A');

     System.out.println("Student Name: " + student.getName());
     System.out.println("Age: " + student.getAge());
     System.out.println("Grade: " + student.getGrade());
     
     student.setAge(-5);
 }
}
