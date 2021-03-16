package com.debayan.designpattern.Observer_Handson;

public class MessageSubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
	}

}