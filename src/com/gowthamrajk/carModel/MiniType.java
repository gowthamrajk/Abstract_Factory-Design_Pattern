package com.gowthamrajk.carModel;

public class MiniType extends Car {

	public MiniType(String makeLocation) {
		
		super("MINI", makeLocation);
		orderCar();
	}

	@Override
	protected void orderCar() {
		
		System.out.println("\nOrdered your new MINI Car !!!\n");
		specifications();
	}
	
    public void specifications() {
		
		System.out.println("Specifications : 3 Lakh INR, 4 seater, ALTO K10, 38L fuel capacity\n");	
	}
}
