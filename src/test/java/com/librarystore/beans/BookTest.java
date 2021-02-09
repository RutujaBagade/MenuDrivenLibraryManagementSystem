package com.librarystore.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BookTest {
	Book book=new Book(101, "c programming","yashwant kanitkar", 890, 600);
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	

	@Test
	void testIsAvailable() {
		assertFalse(book.isAvailable());
	}

	

	@Test
	void testGetBookId() {
		assertEquals(101,book.getBookId());
	}

	

	@Test
	void testGetBookName() {
		assertEquals("c programming",book.getBookName());
	}



	@Test
	void testGetAuthorName() {
		assertEquals("yashwant kanitkar",book.getAuthorName());
	}


	@Test
	void testGetPage() {
		assertEquals(890,book.getPage());
	}



	

}
