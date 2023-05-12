package com.library;

public class Book {

	private int isbn;
	private String title;
	private float price;
	private boolean status;// true - present, false - not present
	
	Book(){}
	Book(int isbn, String title, float price, boolean status){
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.status = status;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "\nBook [isbn=" + isbn + ", title=" + title + ", price=" + price + ", status=" + status + "]";
	}
	
}
