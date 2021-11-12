package com.john.myproject;

public class SimpleMath {
	
	public double circleArea(double radius) throws InvalidValueException{
		if(radius<0) {
			throw new InvalidValueException("Radius of a circle cannot be negative.");
		}
		return Math.PI * Math.pow(radius, 2);
	}
}
