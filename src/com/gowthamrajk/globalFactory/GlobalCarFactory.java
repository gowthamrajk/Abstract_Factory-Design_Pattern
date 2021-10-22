package com.gowthamrajk.globalFactory;

import com.gowthamrajk.carModel.Car;
import com.gowthamrajk.factories.AmericanCarFactory;
import com.gowthamrajk.factories.AsianCarFactory;
import com.gowthamrajk.factories.EuropianCarFactory;

public class GlobalCarFactory {
	
	public Car decideMakeLocation(String makeLocation, String carType) {
		
		Car car = null;
		
		if(makeLocation.equalsIgnoreCase("asia")) {
			
			AsianCarFactory asianCarFactory = new AsianCarFactory();
			car = asianCarFactory.orderNewCar(carType);
		}
		else if(makeLocation.equalsIgnoreCase("america")) {
			
			AmericanCarFactory americanCarFactory = new AmericanCarFactory();
			car = americanCarFactory.orderNewCar(carType);
		}
		else if(makeLocation.equalsIgnoreCase("europe")) {
	
	        EuropianCarFactory europianCarFactory = new EuropianCarFactory();
	        car = europianCarFactory.orderNewCar(carType);
        }
		
		return car;
	}
}