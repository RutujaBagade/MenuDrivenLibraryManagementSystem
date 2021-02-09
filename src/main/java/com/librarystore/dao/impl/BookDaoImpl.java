package com.librarystore.dao.impl;

import java.util.ArrayList;

import java.util.List;
import org.apache.log4j.Logger;
import com.librarystore.beans.Book;
import com.librarystore.dao.IBookDao;

public class BookDaoImpl implements IBookDao {
	private static Logger log=Logger.getLogger(BookDaoImpl.class);
//List acts as databse
	public static List<Book> books = new ArrayList<Book>();

	
	int bookid=0;

	//adding a new Book
	public Boolean saveBook(Book book) {
		
		bookid=bookid+1;
		book.setBookId(bookid);
		book.setAvailable(true);
		books.add(book);
		if(books.size()>=1)
		{
		     return true;
		}
		return false;
	}

	
   //show books
	public List<Book>  showBooks() {
		List<Book> bookList=null;
			for(Book b1: books)
			{	if(b1.isAvailable())
					{
						System.out.println(b1);
						
					}
					else
					{
						log.error("No Books are available in library !!");
						break;		
					}
				}		
		
		return bookList;

	}
	
	

	//find book based on book title
	public Book findByBookName(String bookTitle) {
		Book book=null;
		
		// Filter based on name
		for(Book book1:books)
		{
		     if( (book1.getBookName().equalsIgnoreCase(bookTitle))&& (book1.isAvailable()==true))
				
					return book1;      
	     }

      return book;
}

	//find book based on book AuthorName
	@Override
	public Book findByAuthorName(String authorName) {
		
		Book book=null;
		
			// Filter based on name
			for(Book book1:books)
			{
			     if( (book1.getAuthorName().equalsIgnoreCase(authorName))&& (book1.isAvailable()==true))
					
						return book1;      
		     }
	
      return book;
}

	

	@Override
	public Book findByBookId(int bookId) {

		Book book=null;
			// Filter based on name
		
			for(Book book1:books)
			{
				
				if(book1.getBookId()==bookId)
				{
					return book1;
		        }
			}
      return book;
}


	public void issueBook(Book book) {
		// TODO Auto-generated method stub
	
	       
		Book book1 = null;
		
			 for(Book b:books)
			{
				
				if(book.getBookId()==b.getBookId())
			    {
				    	if(b.isAvailable())
				    	{
				    		
				    		b.setAvailable(false);
				    		log.debug("Book is issued successfully !!!");
				    		
				    	}
				    	else
				    	{
				    		log.warn("Sorry .... This Book is given to someone else");
				    		break;
				    	}	
			    }
			    else
			    {
			    	log.warn("This book id is not exist");
			    	break;
			  
			    	
			    }
			}
	}

		public void LoanedBooks()
			{
				if(!books.isEmpty())
				{
					for(Book b:books)
					{
						if(b.isAvailable()==false)
							System.out.println(b);
							
						else
						{
							log.info("No Books are issuesd from library !!");
						    break;
							
						}
						
					}
					
				}
				else
				{
					log.info("No books are issued yet..");
					
				}
	     }
	@Override
	public void returnBook(Book book) 
	{
		
			for(Book b:books)
			{
				    if(book.getBookId()==b.getBookId() &&(b.isAvailable()==false))
				    {
				    	
				    		System.out.println("Book is returned to library Successfully !");
				    		b.setAvailable(true); 		
				    	
				    }
				    else
				    {
				    	log.debug("This book is not issued yet...so first you have to issue this book !!!");
				    
				    }
			}
	
		}


	@Override
	public Boolean checkBookList() {
		// TODO Auto-generated method stub
		if(books.isEmpty())
		{
			log.warn("Your Book  Library is empty  !!!");
			return false;
		}
		return true;
		
	}
		
	
	
	

	}
	

	


	



