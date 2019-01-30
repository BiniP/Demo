package com.sansa.class2;

public class BMWsubclass extends CarBaseClass {
	
	public String model = "E46";

//overridden method
	
	public void enginestart() {
		
		System.out.println("The BMW subclass start method : " + start);
	}

//Sub class own features
	
	public void airbag() {
		
		System.out.println("The BMW air bag facility:" + model);
	}

}
