package com.debayan.designpattern.Mediator_Handson;

public class BasicUser implements IUser {

	private IChatMediator chatMediator;
	private String name;

	public BasicUser(IChatMediator m, String name) {
		this.chatMediator = m;
		this.name = name;
	}

	@Override
	public void recieveMessage() {

		System.out.println("Message recieved from " + this.name);
	}

	@Override
	public void sendMessage() {
		chatMediator.sendMessage();
	}

}
