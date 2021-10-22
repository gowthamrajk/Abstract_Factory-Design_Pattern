package com.gowthamrajk.carModel;

public abstract class Car {
	
	private String carType;
	private String makeLocation;
	
	protected abstract void orderCar();
	
	protected Car(String carType, String makeLocation) {
		
		this.carType = carType;
		this.makeLocation = makeLocation;
	}

	@Override
	public String toString() {
		
		return "Your " + carType + " type car is manufactured and will be delivered from " + makeLocation 
				+ " branch factory.\n";
	}
}
