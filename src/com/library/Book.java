package com.library;

public class Book {
	private int numOfPages;
	private String title;

	public Book(int numOfPages, String title) {
		if(numOfPages > 0) {
		this.numOfPages = numOfPages;
		}
		this.title = title;
	}
	
	public Book() {
		
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		if(numOfPages > 0) {
		this.numOfPages = numOfPages;
		}else {
			System.out.println("Numarul de pagini introdus trebuie sa fie mai mare decat zero");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}
