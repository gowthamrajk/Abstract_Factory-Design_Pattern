package com.gowthamrajk.carModel;

public class SedanType extends Car {

	public SedanType(String makeLocation) {
		
		super("SEDAN", makeLocation);
		orderCar();
	}

	@Override
	protected void orderCar() {
		
		System.out.println("\nOrdered your new SEDAN Car !!!\n");
		specifications();
	}
	
    public void specifications() {
		
		System.out.println("Specifications : 6.5 Lakh INR, 5 seater, HONDA AMAZE, 45L fuel capacity\n");	
	}

}
