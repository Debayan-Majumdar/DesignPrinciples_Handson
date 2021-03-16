package com.debayan.designpattern.Mediator_Handson;

public class TestchatMediator {

	public static void main(String[] args) {

		IChatMediator chatmediator = new ChatMediator();
		IUser b_user = new BasicUser(chatmediator, "Debayan");
		IUser p_user = new BasicUser(chatmediator, "Tapas");

		chatmediator.AddUser(p_user);
		chatmediator.AddUser(b_user);

		b_user.sendMessage();
		p_user.recieveMessage();
		p_user.sendMessage();
		b_user.recieveMessage();
	}

}
