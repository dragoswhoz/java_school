package com.library;

import java.util.*;

public class LibraryClient extends Client{
	private List<Book> listOfBorrowedBooks = new ArrayList<>();
	
	
	
	public LibraryClient(String firstName, String lastName, String phoneNumber, String socialNumber) {
		super(firstName, lastName, phoneNumber, socialNumber);
	}

	public List<Book> getListOfBorrowedBooks() {
		return listOfBorrowedBooks;
	}


	public void addBookToBorrowedList(Book book) {
		listOfBorrowedBooks.add(book);
	}
	
	public void deleteBookFromBorrowedList(Book book) {
		listOfBorrowedBooks.remove(book);
	}

	
	

	
	
}


