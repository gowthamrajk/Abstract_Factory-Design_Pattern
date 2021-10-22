package com.gowthamrajk.carModel;

public class LuxuryType extends Car {

	public LuxuryType(String makeLocation) {
		
		super("LUXURY", makeLocation);
		orderCar();
	}

	@Override
	protected void orderCar() {
		
		System.out.println("\nOrdered your new Luxury Car !!!\n");
		specifications();
	}
	
	public void specifications() {
		
		System.out.println("Specifications : 45 Lakh INR, 5 seater, JAGUAR XF, 74L fuel capacity\n");	
	}
}
