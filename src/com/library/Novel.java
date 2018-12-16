package com.library;

public class Novel extends Book {
	private String type;
	
	

	public Novel(int numOfPages, String title, String type) {
		super(numOfPages, title);
		this.type = type;
	}
	
	public Novel() {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
