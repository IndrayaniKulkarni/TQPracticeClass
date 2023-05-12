package com.library;

public class LibraryTest {
	public static void availableBooks(Library lib) {
		Book[] ls = lib.getBooks();
		System.out.println("Available books = ");
		for(int i=0; i<ls.length; i++) {
			if(ls[i].isStatus()) {
				System.out.println(ls[i]);
			}
		}
	}
	public static void maxPrice(Library lib) {
		
		Book[] ls = lib.getBooks();
		
		Book maxPricedBook = ls[0];
		
		
		for(int i=0; i<ls.length; i++) {
			if(maxPricedBook.getPrice() < ls[i].getPrice()) {
				maxPricedBook = ls[i];
			}
		}
		System.out.println("High price book in Library = "+maxPricedBook);
	}
	public static void main(String[] args) {
		
		Library lib = new Library(1201,"Library store","M.G.Road");
		
		Book[] b = new Book[6];
		b[0] = new Book(10112,"Frankeinstien",340.0f,true);
		b[1] = new Book(2322,"The code of wooster",550.0f,false);
		b[2] = new Book(10134,"Thank you,Jeeves",660.0f,true);
		b[3] = new Book(2322,"The picture of dorian gray",450.0f,false);
		b[4] = new Book(10892,"Harry Potter",340.0f,true);
		b[5] = new Book(23322,"A chrishmas carol",550.0f,false);
		
		lib.setBooks(b);
		System.out.println("Books in library ");
		System.out.println(lib);
		System.out.println("-------------------------------");
		maxPrice(lib);
		System.out.println("-------------------------------");
		availableBooks(lib);
	}

}
