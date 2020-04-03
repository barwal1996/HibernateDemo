package com.niit.tlc.demo;

public class Book {
	private int Bookid;
	private String bookName;
	private String Author;
	private int Price;
	public Book(int bookid, String bookName, String author, int price) {
		
		Bookid = bookid;
		this.bookName = bookName;
		Author = author;
		Price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBookid() {
		return Bookid;
	}
	public void setBookid(int bookid) {
		Bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
}
