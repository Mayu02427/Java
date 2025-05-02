package com.abstraction;

public class Airtel implements Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airtel airtel= new Airtel();
		airtel.calling();
		airtel.wifi();

	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("You are using airtel sim calling");
	}

	@Override
	public void wifi() {
		// TODO Auto-generated method stub
		System.out.println("You are using airtel sim for mobile data");
		
	}

}
