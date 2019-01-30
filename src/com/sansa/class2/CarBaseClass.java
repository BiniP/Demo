package com.sansa.class2;

public class CarBaseClass {

	protected String gear = "Auto";

	protected String start = "ON";

	public void enginestart() {
		System.out.println("The car base class start method : " + start);
	}

	public void geartype() {

		System.out.println("The car base class gear type: " + gear);
	}

}
