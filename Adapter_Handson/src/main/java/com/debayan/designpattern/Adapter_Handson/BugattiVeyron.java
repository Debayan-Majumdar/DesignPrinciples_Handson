package com.debayan.designpattern.Adapter_Handson;

public class BugattiVeyron implements Movable {
	@Override
	public double getSpeed() {
		return 268;
	}

	@Override
	public double getPrice() {
		return 2500;
	}
}