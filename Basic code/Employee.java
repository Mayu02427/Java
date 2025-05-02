//WAP to create Employee class with field(Eid,name,salary);
class Employee 
{
    int Eid;
    String name;
    double salary;

    
    public void getInfo() {
        System.out.println("Employee ID: " + Eid + "\tName: " + name + "\tSalary: " + salary);
    }

    public static void main(String args[]) {
        
        Employee emp = new Employee();
        emp.Eid = 104;
        emp.name = "Albert";
        emp.salary = 50000.0;

        emp.getInfo();
    }
}
