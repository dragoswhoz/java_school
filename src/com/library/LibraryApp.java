package com.library;

public class LibraryApp {

	public static void main(String[] args) {
		/* First create a book catalog and a list of clients */

		LibraryCatalog booksCatalog1 = new LibraryCatalog();
		ClientsDatabase clientList = new ClientsDatabase();

// lets create 3 books
		Book book1 = new Novel(150, "Codul lui DaVinci", "Mystery");
		Book book2 = new AlbumArt(20, "Yet another album art", "good");
		Novel book3 = new Novel(132, "Pride and prejudice", "Romance");

// add the three books to the book catalog

		booksCatalog1.addBook(book1);
		booksCatalog1.addBook(book2);
		booksCatalog1.addBook(book3);

// create two clients of the library

		Client client1 = new LibraryClient("Dragos", "Pirvu", "0745159896", "123456789");
		Client client2 = new LibraryClient("Alin", "Frincu", "076000111", "987654321");

//add the two clients to the list of clients

		clientList.addClient(client1);
		clientList.addClient(client2);

// simulate borrowing books.
// This means the book change status from default "in library" to "borrowed" and the book is added to the 
// list with borrowed boks of the client

		booksCatalog1.borrowBook("Codul lui DaVinci", "Dragos", "Pirvu");
		booksCatalog1.borrowBook("Pride and prejudice", "Dragos", "Pirvu");
		System.out.println(book1.getStatus());
		clientList.printBorrowedBooksByClient("Dragos", "Pirvu");

// try to borrow a book that is already borrowed
		booksCatalog1.borrowBook("Pride and prejudice", "Dragos", "Pirvu");
		clientList.printBorrowedBooksByClient("Dragos", "Pirvu");

// simulate a return of a book
// this means the book should change status to "in library" and the book should be deleted from the list of 
// borrowed books of the client

		booksCatalog1.returnBook("Codul lui DaVinci");
		System.out.println(book1.getStatus());
		clientList.printBorrowedBooksByClient("Dragos", "Pirvu");

// print all books in the library catalog
		booksCatalog1.printAllBooks();

// find who borrowed certain book - serach by book title

		Client test = ClientsDatabase.findClientThatBorrowedBookByTitle("Pride and prejudice");
		System.out.println(test.getFirstName() + " " + test.getLastName());

	}

}
