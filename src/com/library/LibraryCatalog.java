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
		for (Book book : bookList) {
			if (book.getTitle().toLowerCase().equals(bookName.toLowerCase())) {
				bookList.remove(book);
				System.out.println(bookName + " removed");
				System.out.println();
				return true;
			} else {
				System.out.println(bookName + " is not on the list");
				System.out.println();
				return false;
			}

		}
		return false;

	}

	public Book findBookByName(String bookName) {
		for (Book book : bookList) {
			if (book.getTitle().toLowerCase().equals(bookName.toLowerCase())) {
				System.out.println("The book is on the list");
				System.out.println();
				return book;
			} else {
				System.out.println("The book is not on the list");
				System.out.println();
				return null;
			}

		}
		return null;

	}

	public void printAllBooks() {
		for (Book book : bookList) {
			System.out.println(book.getTitle());
		}

	}

}
