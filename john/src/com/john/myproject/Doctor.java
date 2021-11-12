package com.john.myproject;

public class Doctor extends Person {

	public Doctor(String name) {
		this.name = name;
	}
//	@Override
	public String getOccuption() { // implementation of getOccupation() method defined in Occupation interface.
		// TODO Auto-generated method stub
		return "Doctor";
	}

	@Override
	public int add(int x, int y) { // every subclass do this method differently
		return 0;
	}

}
