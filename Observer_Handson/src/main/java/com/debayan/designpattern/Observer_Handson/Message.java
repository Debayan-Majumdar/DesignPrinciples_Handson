package com.debayan.designpattern.Observer_Handson;

public class Message {

	final String messageContent;

	public Message(String m) {
		this.messageContent = m;
	}

	public String getMessageContent() {
		return messageContent;
	}
}