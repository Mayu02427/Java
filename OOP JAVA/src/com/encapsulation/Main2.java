package com.encapsulation;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Main1.BankAccount myAccount =new Main1.BankAccount("ABC123", 1000.0);
    
    myAccount.deposit(500);
    System.out.println("Current Balance: "+ myAccount.getBalance());
    
    myAccount.withdraw(200);
    System.out.println("Current Balance" +myAccount.getBalance());
    
    myAccount.withdraw(2000);
	}

}
