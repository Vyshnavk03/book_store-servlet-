package com.js.dto;

public class Books {
	private int bookId;
	private String bookName;
	private String AuthorName;
	private double price;
	private int Noofpages;
	
	public Books() {
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofpages() {
		return Noofpages;
	}

	public void setNoofpages(int noofpages) {
		Noofpages = noofpages;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", AuthorName=" + AuthorName + ", price=" + price
				+ ", Noofpages=" + Noofpages + "]";
	}
	
	

	
	

}
