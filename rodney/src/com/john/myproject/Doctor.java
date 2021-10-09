package com.john.myproject;

public class Doctor extends Person {

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
