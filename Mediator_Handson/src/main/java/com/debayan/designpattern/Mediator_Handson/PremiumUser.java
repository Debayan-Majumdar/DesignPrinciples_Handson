package com.debayan.designpattern.Mediator_Handson;

public class PremiumUser implements IUser {

	private IChatMediator chatMediator;
	private String name;

	public PremiumUser(IChatMediator m, String name) {
		this.chatMediator = m;
		this.name = name;
	}

	@Override
	public void recieveMessage() {
		System.out.println("Message recieved " + this.name);
	}

	@Override
	public void sendMessage() {
		chatMediator.sendMessage();

	}

}
