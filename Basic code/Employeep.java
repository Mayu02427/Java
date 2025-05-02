//Employee class 
/*
 constructor are special member functions whose name is same as class name.
 Constructor do not have any return type not even void
 constructor gets called automatically main object is created.
*/
class Employeep {
// Attributes (Instance Variable)
int id;
String name;
double salary;

//constructor Its used to initialized instances variabl
public Employee(int,String name, double salary)
{
 id1=id;
 this.name=name;
 this.salary=salary;
}
// Method to display employee details void displayEmployeeInfo() {

System.out.println("Employee ID: " id1);

System.out.println("Employee Name: + name);

System.out.println("Employee Salary: $" + salary); 
System.out.println("-----------");

}

// Main method to create objects and call methods

public static void main(String[] args) {

// Creating objects of Employee class

Employeep emp1= new Employeep (101, "Alice", 50000); 
Employeep emp2 new Employeep (102, "Bob", 60000);

// Calling method to display employee details

emp1.displayEmployeeInfo();

emp2.displayEmployeeInfo();



}

}
