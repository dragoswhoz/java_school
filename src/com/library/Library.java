package com.library;

public interface Library {
	void addBook(Book book);

	boolean deleteBookByName(String bookName);

	Book findBookByName(String bookName);
	
	void printAllBooks();
	
	public void borrowBook(String bookName, String firstName, String lastName);
	
	
	public void returnBook(String bookName);

}
