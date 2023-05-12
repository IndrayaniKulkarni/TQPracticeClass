package com.library;

import java.util.Arrays;

public class Library {

	private int id;
	private String name;
	private String place;
	private Book books[];
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}
	public Library(int id, String name, String place, Book[] books) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.books = books;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", place=" + place + ", books=" + Arrays.toString(books) + "]";
	}
	
	
}
