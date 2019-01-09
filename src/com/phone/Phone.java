package com.phone;

public interface Phone {
	void addContact(String no, String phoneNumber, String firstName, String lastName);
	void listContacts();
	void sendMessage(String phoneNumber, String messageContent);
	void listMessages(String phoneNumber);
	void call(String phoneNumber);
	void viewHistory();
	void turnOff();
	void turnOn();
	

}
