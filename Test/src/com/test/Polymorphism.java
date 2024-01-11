package com.test;

public class Polymorphism {



	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.car();
		vehicle.car(null);
		
		Ferrari ferrari = new Ferrari();
		ferrari.car();
		
		
	}
	


}

class Vehicle{
	
	public void car() {
		System.out.println("BMW");
	}
	
	public void car(String model) {
		System.out.println("BMW X5");
	}
}


class Ferrari extends Vehicle{
	
	@Override
	public void car() {
		System.out.println("SF90");
	}
}
