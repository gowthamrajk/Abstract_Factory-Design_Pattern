package com.gowthamrajk.factories;

import com.gowthamrajk.carModel.Car;
import com.gowthamrajk.carModel.LuxuryType;
import com.gowthamrajk.carModel.MiniType;
import com.gowthamrajk.carModel.SedanType;

public class EuropianCarFactory {
	
    public Car orderNewCar(String carType) {
		
		Car car = null;
		
		if(carType.equalsIgnoreCase("MINI")) {
			car = new MiniType("EUROPE");
		}
		else if(carType.equalsIgnoreCase("SEDAN")) {
			car = new SedanType("EUROPE");
		}
		else if(carType.equalsIgnoreCase("LUXURY")) {
			car = new LuxuryType("EUROPE");
		}
		
		return car;
	}
}