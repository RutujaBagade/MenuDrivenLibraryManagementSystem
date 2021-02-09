package com.librarystore.service.impl;


import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;

import com.librarystore.beans.Book;
import com.librarystore.dao.IBookDao;
import com.librarystore.dao.impl.BookDaoImpl;
import com.librarystore.service.IBookService;

public class BookServiceImpl implements IBookService {
		 private  IBookDao bookDao=new BookDaoImpl() ;
		 private static Logger log=Logger.getLogger(BookServiceImpl.class);
	     public void addBook(Book book) {
		    Boolean status=bookDao.saveBook(book);
		    if(status)
		    {
		    	log.debug("******Your book is added Successfully !!!!********");
		    }
		    
	      }
	
		public void showAllBooks() {
			if(bookDao.checkBookList())
			{
		           bookDao.showBooks();
			}
		}
			

		public void searchByBookName(String bookTitle)  {
			
	         Book book= bookDao.findByBookName(bookTitle);
	         if(book!=null)
				{
					log.debug(book);
				}
				else
				{
					log.error("This "+bookTitle+" book is not exist in library !!");
				}
		      
		}

		public void searchByAuthorName(String  bookAuthorName) {
			Book book=  bookDao.findByAuthorName(bookAuthorName);
				if(book!=null)
				{
					log.debug(book);
				}
				else
				{
					 log.error("This "+bookAuthorName+" book is not exist in library !!");
				}
		}

		@Override
		public Book searchById(int bookId) {
			
			 return bookDao.findByBookId(bookId);
		}

		@Override
		public void issueBook(Book book) {
			// TODO Auto-generated method stub
		
			bookDao.issueBook(book);
			
		}

		@Override
		public void returnBook(Book book) {
			// TODO Auto-generated method stub
			bookDao.returnBook(book);
		}

		@Override
		public void showLoanedBooks() {
			// TODO Auto-generated method stub
			bookDao.LoanedBooks();
		}

		@Override
		public Boolean checkBookList() {
			// TODO Auto-generated method stub
			return bookDao.checkBookList();
		}

		
	
}
