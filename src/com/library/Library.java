package com.library;

public interface Library {
	void addBook(Book book);

	boolean deleteBookByName(String bookName);

	Book findBookByName(String bookName);
	
	void printAllBooks();

}
