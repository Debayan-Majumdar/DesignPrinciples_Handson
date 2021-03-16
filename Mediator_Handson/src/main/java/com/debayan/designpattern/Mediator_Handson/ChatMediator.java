package com.debayan.designpattern.Mediator_Handson;

import java.util.ArrayList;

public class ChatMediator implements IChatMediator {

	private ArrayList<IUser> users;

	public ChatMediator() {
		users = new ArrayList<IUser>();
	}

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage() {

		for (IUser user : users) {
			user.recieveMessage();
		}

	}

}