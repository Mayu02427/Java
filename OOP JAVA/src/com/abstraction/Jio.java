package com.abstraction;

public class Jio implements Sim{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jio jio1= new Jio();
		jio1.calling();
		jio1.wifi();

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("You are using jio sim calling");

	}

	@Override
	public void wifi() {
		// TODO Auto-generated method stub
		System.out.println("You are using jio sim for mobile data");

	}

}
