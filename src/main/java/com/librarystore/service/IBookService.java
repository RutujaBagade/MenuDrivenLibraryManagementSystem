package com.librarystore.service;

import java.util.List;
import java.util.Optional;

import com.librarystore.beans.Book;

public interface IBookService {
	public void addBook(Book book) ;
	public void showAllBooks() ;
	public void searchByBookName(String bookTitle) ;
	public void searchByAuthorName(String bookAuthor) ;
	public Book searchById(int bookId);

	 public void issueBook(Book book);
	 public void returnBook(Book book);
	public void showLoanedBooks();
	 public Boolean checkBookList();
}
