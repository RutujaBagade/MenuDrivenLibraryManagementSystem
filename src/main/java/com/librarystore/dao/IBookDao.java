package com.librarystore.dao;

import java.util.List;

import com.librarystore.beans.Book;

public interface IBookDao {
	public Boolean saveBook(Book book) ;
	public List<Book> showBooks() ;
	public Book findByBookName(String bookTitle);
	public Book findByAuthorName(String authorName) ;
	public Book findByBookId(int bookId) ;
	 public void issueBook(Book book);
	 public void returnBook(Book book);
	 public void LoanedBooks();
	 public Boolean checkBookList();
}
