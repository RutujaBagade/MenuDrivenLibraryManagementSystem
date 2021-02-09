package com.librarystore.dao.impl;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.librarystore.beans.Book;
import com.librarystore.dao.IBookDao;

class BookDaoImplTest {
	private IBookDao dao;
	
	

	@BeforeEach
	void setUp() throws Exception {
		dao=new BookDaoImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSaveBook() {
		Book book=new Book();
		book.setBookId(101);
		book.setBookName("sql");
		book.setAuthorName("manas ghosh");
		book.setPage(900);
		book.setPrice(500);
		book.setAvailable(true);
		Boolean flag=dao.saveBook(book);
		assertTrue(flag);

		
	}	
	
	@Test
	void testFindByAuthorName()
	{
		Book book=dao.findByAuthorName("manas ghosh");
		
		assertNotNull(book);
		assertEquals("manas ghosh",book.getAuthorName());
		
	}

	
	
	
	
	 

}
