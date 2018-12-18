package com.library;

import java.util.*;

public class ClientsDatabase {

	private static List<Client> clientList = new ArrayList<>();

	public void addClient(Client client) {
		clientList.add(client);
		System.out.println("\"" + client.getFirstName() + " " + client.getLastName() + "\" added to client list");
		System.out.println();
	}

	public boolean deleteClientFirstNameLastName(String firstName, String lastName) {
		if (findClientByFirstNameLastName(firstName, lastName) == null) {
			return false;
		} else {
			clientList.remove(findClientByFirstNameLastName(firstName, lastName));
			return true;
		}
	}

	public static Client findClientByFirstNameLastName(String firstName, String lastName) {
		for (Client client : clientList) {
			if (client.getFirstName().toLowerCase().equals(firstName.toLowerCase()) && client.getLastName().toLowerCase().equals(lastName.toLowerCase())) {
				return client;
			} else {
				continue;
			}
		}
		return null;
	}

	public void printAllClients() {
		if (clientList.size() == 0) {
			System.out.println("The client list is empty");
		} else {
			for (Client client : clientList) {
				System.out.println(client.getFirstName() + " " + client.getLastName() + " " + client.getSocialNumber());
			}
		}
	}

	public static LibraryClient findClientThatBorrowedBookByTitle(String title) {
		for (Client client : clientList) {
			if (client instanceof LibraryClient) {
				List<Book> list = ((LibraryClient) client).getListOfBorrowedBooks();
				for (Book book : list) {
					if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
						return (LibraryClient) client;
					}
				}
			}
			
		}
		return null;
	}

	public void printBorrowedBooksByClient(String clientFirstName, String clientLastName) {
		for (Client client : clientList) {
			if (client instanceof LibraryClient) {
				if(client.getFirstName().toLowerCase().equals(clientFirstName.toLowerCase()) && client.getLastName().toLowerCase().equals(clientLastName.toLowerCase())) {
					System.out.println(clientFirstName + " " + clientLastName + " borrowed the following books:");
					List<Book> list = ((LibraryClient) client).getListOfBorrowedBooks();
					for (Book book : list) {
						System.out.println(book.getTitle());
					}
				}
				
			}
			System.out.println();
			
		}
 		
	}
	
}
