package com.debayan.designpattern.BuilderPattern_Handson;

public class Coke extends ColdDrink {

	@Override
	public float price() {
		return 30.0f;
	}

	public String name() {
		return "Coke";
	}

}