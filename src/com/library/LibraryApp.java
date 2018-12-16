package com.library;

public class LibraryApp {

	public static void main(String[] args) {
		
		LibraryCatalog catalog1 = new LibraryCatalog();
		Book book1 = new Novel(150, "Yet another album art", "Mystery");
		catalog1.addBook(book1);
		Book book2 = new AlbumArt(20, "Codul lui DaVinci", "good");
		catalog1.addBook(book2);
		catalog1.printAllBooks();
		
		catalog1.deleteBookByName("codul lui davinci");
		catalog1.printAllBooks();
		

	}

}
