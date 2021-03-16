package com.debayan.designpattern.BuilderPattern_Handson;

public abstract class Burger implements Item {

	// @Override
	public Packing packing() {
		return new Wrapper();
	}

	// @Override
	public abstract float price();

}