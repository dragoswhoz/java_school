package com.library;

public class Book {
	public static final String INLIBRARYSTATUS = "In Library";
	public static final String BORROWEDSTATUS = "Borrowed";

	private String status = INLIBRARYSTATUS;
	private int numOfPages;
	private String title;
	
	// Three constructors

	public Book(int numOfPages, String title, String status) {
		if (numOfPages > 0) {
			this.numOfPages = numOfPages;
		}
		this.title = title;
	}
	
	public Book(int numOfPages, String title) {
		
		if (numOfPages > 0) {
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
		if (numOfPages > 0) {
			this.numOfPages = numOfPages;
		} else {
			System.out.println("Numarul de pagini introdus trebuie sa fie mai mare decat zero");
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status.equals(INLIBRARYSTATUS) || status.equals(BORROWEDSTATUS)) {
			this.status = status;
		} else {
			System.out.println("Status should be " + INLIBRARYSTATUS + " or " + BORROWEDSTATUS);
		}
	}

}
