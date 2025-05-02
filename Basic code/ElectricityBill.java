class ElectricityBill{

public static void main(String args[])
{
int units, bill;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the Units: ");
units=sc.nextInt();

if (units>=1 && units<=100) {

bill=(units 10); 
System.out.println("The Electrical Bill is "+bill);
}

else if (units>100 && units<=200)

bill (100-10)+ ((units-100)*15)
System.out.println("The Electrical Bill is "+bill);
}

else if (units>200 && units<=300)

{

bill(100*10)+(100*15) ((units-200)*20); 
System.out.println("The Electrical Bill is "bill);
}

else{

bill(100*10) (100*15)+(100*20)+ ((units-300)*25); 
System.out.println("The Electrical Bill is "+bill);
 }
}
}