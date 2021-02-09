package com.librarystore.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.librarystore.beans.Book;
import com.librarystore.beans.Student;
import com.librarystore.service.IBookService;

import com.librarystore.service.IstudentService;
import com.librarystore.service.impl.BookServiceImpl;
import com.librarystore.service.impl.StudentServiceImpl;
import com.librarystore.service.impl.UserServiceImpl;

public class LibraryFilter {
	   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	  IBookService bookService=new BookServiceImpl();
	   IstudentService studentService=new StudentServiceImpl();
	   int b=1;
     public  void showAdminMenu() throws NumberFormatException, IOException
     {
    		
			do
			{
				
						    System.out.println("Enter 0 to Exit Application.");
							System.out.println("Enter 1 to Add new Book.");
							System.out.println("Enter 2 to Display All books");
							System.out.println("Enter 3 to Display All Students Details");
						    System.out.println("Enter 4 to show Loaned Books");
						    System.out.println("Enter 5 to log out from library");
						    System.out.println("Enter Your choice :");
							 b=Integer.parseInt(reader.readLine());
							
							
								
								switch(b)
								{
								case 0:
									System.out.println("Bye..Bye..Application is closed");
									System.exit(0);
									break;
								  case 1:
									
									  
									   System.out.println("Enter Book Name:");
									    String bookName= reader.readLine();
												    
									    System.out.println("Enter Author Name:");
									    String authorName = reader.readLine();
									    
									    System.out.println("Enter Page no:");
									    int page = Integer.parseInt(reader.readLine());
									    
									    System.out.println("Enter price:");
									    int price = Integer.parseInt(reader.readLine());
									    Book books=new Book(bookName,authorName,page,price);
									 
									    
									    bookService.addBook(books);
								  break;
								  
								  case 2:
									  bookService.showAllBooks();
						                break;
						                
								  case 3:
									  studentService.viewStudents();
						                break;
						                
								  case 4:
									  bookService.showLoanedBooks();
						                break;
								  case 5:
									  b=0;
									  System.out.println("You are succesfully Logout !!!");
						                break;
						            default:
						               System.out.println("Invalid Choice");
	                                    break;
						        }
			}
			while(b!=0);
			} 
	 
     
     public  void showUserMenu() throws NumberFormatException, IOException
     {
    	 
			do
			{
				
						  System.out.println("Enter 0 to Exit Application.");
							System.out.println("Enter 1 to Register a student");
							System.out.println("Enter 2 to search book based On Title");
							System.out.println("Enter 3 to search book based On Author");
							System.out.println("Enter 4 to show all books");
							System.out.println("Enter 5 to issue a book");
							System.out.println("Enter 6 to return a book");
							System.out.println("Enter 7 Log out from library");
							System.out.println("Enter Your choice :");
							b=Integer.parseInt(reader.readLine());
							
								switch(b)
								{
								case 0:
									System.exit(0);
									break;
								  case 1:
									  System.out.println("Enter Student Id:");
									   int studentID = Integer.parseInt(reader.readLine());
									  
									   System.out.println("Enter Student Name:");
									    String studentName= reader.readLine();
												    
									    System.out.println("Enter Student email:");
									    String studentEmail= reader.readLine();
												    
									    System.out.println("Enter Student Phone:");
									    String studentPhone = reader.readLine();
									    
									    
									    System.out.println("Enter Student Branch Name:");
									    String studentBranch= reader.readLine();
												    
									    System.out.println("Enter Student CourseName:");
									    String studentCourse = reader.readLine();
									    
									    Student student1=new Student(studentID,studentName,studentEmail,studentPhone,studentBranch,studentCourse);
								        studentService.addStudent(student1);
									    break;
								  
								  case 2:
									 Boolean flag= bookService.checkBookList();
									 if(flag==true)
									 {
									  System.out.println("*********SEARCH BY Book NAME*********");
									   System.out.println("Enter BookName: that you want :");
									    String bookName =reader.readLine();
									     bookService.searchByBookName(bookName);
									 }
						                break;
									 
									  
								  case 3:
									  Boolean flag1= bookService.checkBookList();
										 if(flag1==true)
										 {
									  System.out.println("******SEARCH BY Book  Author NAME***********");
									  System.out.println("Enter Book AuthorName:");
									   String authorName = reader.readLine();
									   bookService.searchByAuthorName(authorName);
									   }
						                break;
								  case 4:
									  bookService.showAllBooks();
									  break;
								  case 5:
									  Boolean flag2= bookService.checkBookList();
										 if(flag2==true)
										 {
										System.out.println("Enter Book Number");
										int bookNumber = Integer.parseInt(reader.readLine());
										
									    Book book=new Book();
										
										book.setBookId(bookNumber);
									
										bookService.issueBook(book);   
										 }
									  break;
								  case 6:
									  Boolean flag21= bookService.checkBookList();
										 if(flag21==true)
										 {
										System.out.println("Enter Book Number");
										int bookId1 = Integer.parseInt(reader.readLine());
										
									    Book book1=new Book();
										
										book1.setBookId(bookId1);
										book1.setAvailable(true);
										bookService.returnBook(book1); 
										 }
									  break;
								  case 7:
									  b=0;
						                break;
						            default:
						                System.out.println("Invalid Choice");
	                                break;
						        }
			}
			while(b!=0);
			} 
	 
     }
     

