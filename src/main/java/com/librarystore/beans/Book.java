package com.librarystore.beans;

import java.io.Serializable;

public class Book implements Serializable {
	
	
	private static final long serialVersionUID = 3018938273226921556L;
	
	private int bookId;
	private String bookName;
	private String authorName;
    private int page;
	private int price;
	private boolean isAvailable;
	
	
	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
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
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Book() {
		
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", page=" + page
				+ ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
	public Book(int bookId, String bookName, String authorName, int page, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.page = page;
		this.price = price;
	}
	public Book( String bookName, String authorName, int page, int price) {
		super();
	
		this.bookName = bookName;
		this.authorName = authorName;
		this.page = page;
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + bookId;
		result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
		result = prime * result + (isAvailable ? 1231 : 1237);
		result = prime * result + page;
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (bookId != other.bookId)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (isAvailable != other.isAvailable)
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}