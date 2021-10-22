package com.gowthamrajk.abstractFactoryDesignPattern;

import java.util.Scanner;
import com.gowthamrajk.globalFactory.GlobalCarFactory;

public class AbstractFactoryDesignPattern {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hello Customer !!!\nEnter your Car Type : ");
		String carType = scanner.next();
		System.out.println("Enter your model make location : ");
		String makeLocation = scanner.next();
		
		GlobalCarFactory globalCarFactory = new GlobalCarFactory();
		System.out.println(globalCarFactory.decideMakeLocation(makeLocation, carType));
		
		scanner.close();
	}
	
	

}
