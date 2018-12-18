package com.library;

import java.util.*;

public class LibraryCatalog implements Library {

	private List<Book> bookList = new ArrayList<>();

	
	public void addBook(Book book) {

		bookList.add(book);
		System.out.println("\"" + book.getTitle() + "\" added to catalog");
		System.out.println();
	}

	public boolean deleteBookByName(String bookName) {

		if (findBookByName(bookName) == null) {
			System.out.println(bookName + " is not on the list");
			System.out.println();
			return false;
		} else {
			bookList.remove(findBookByName(bookName));
			System.out.println(bookName + " removed");
			System.out.println();
			return true;

		}

	}

	public Book findBookByName(String bookName) {
		for (Book book : bookList) {
			if (book.getTitle().toLowerCase().equals(bookName.toLowerCase())) {
				return book;
			} else {
				continue;
			}

		}
		return null;

	}

	public void printAllBooks() {
		System.out.println("The catalog contains the following books:");
		if (bookList.size() == 0) {
			System.out.println("The catalog is empty!");
		} else {
			for (Book book : bookList) {
				System.out.println("\"" + book.getTitle() + "\" - " + book.getStatus());
			}
		}
		System.out.println();

	}
/* borrowBook method take 3 parameters.
 * It adds the book object returned by findBookByName method to the boroowedList of the client.
 * 
 * */
	public void borrowBook(String bookName, String firstName, String lastName) {
		Book book = findBookByName(bookName);
		if (book == null) {
			return;
		}
		if (book.getStatus().equals(Book.INLIBRARYSTATUS)) {
			book.setStatus(Book.BORROWEDSTATUS);
			LibraryClient client = (LibraryClient) ClientsDatabase.findClientByFirstNameLastName(firstName, lastName);
			client.addBookToBorrowedList(book);
		} else {
			System.out.println("The book " + book.getTitle() + " is already borrowed");

		}

	}

	public void returnBook(String bookName) {
		Book book = findBookByName(bookName);
		if (book == null) {
			return;
		}
		LibraryClient client = ClientsDatabase.findClientThatBorrowedBookByTitle(bookName);
		client.deleteBookFromBorrowedList(book);
		book.setStatus(Book.INLIBRARYSTATUS);
	}

}
