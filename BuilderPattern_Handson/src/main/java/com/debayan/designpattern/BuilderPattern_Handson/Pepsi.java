package com.debayan.designpattern.BuilderPattern_Handson;

public class Pepsi extends ColdDrink {

	@Override
	public float price() {
		return 35.0f;
	}

	public String name() {
		return "Pepsi";
	}
}