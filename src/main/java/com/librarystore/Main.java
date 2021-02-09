package com.librarystore;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


import org.apache.log4j.Logger;


import com.librarystore.beans.User;
import com.librarystore.filter.LibraryFilter;
import com.librarystore.service.IUserService;
import com.librarystore.service.impl.UserServiceImpl;




public class Main {

private static Logger log=Logger.getLogger(Main.class);
public static void main(String[] args) throws IOException, ParseException {
	
	System.out.println("********************Welcome to Library mangement System********************");
	log.debug("********************Its a Console Based project********************");
	while(true)
	{
	log.warn("Log in first ");
	log.debug("********************Library Mangement System********************");
	
	
	
	  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		
   System.out.println("Enter Username : ");
    String user= reader.readLine();
    
    System.out.println("Enter Password : ");
    String pass = reader.readLine();
  IUserService userService=new UserServiceImpl();
    LibraryFilter filter=new LibraryFilter();
    
  
  
 for( User users:userService.showUserDetails())
 {
   if ((users.getName().equalsIgnoreCase(user)) && (users.getPassword().equalsIgnoreCase(pass))) 
		 {

			System.out.println("Login successful");
			 if(users.getUserType().equalsIgnoreCase("ADMIN"))
			 {
				 log.debug("hey !librarian Welcome to your system ");
				 filter.showAdminMenu();
				
			 }
		 
		 
		 else if( (users.getName().equalsIgnoreCase(user)) && (users.getPassword() .equalsIgnoreCase(pass))) 
		 {
				
				 if(users.getUserType().equalsIgnoreCase("USER"))
				 {
					 filter.showUserMenu();
				 }
				
		 }		 
		 
		 else 
			    {
			        log.error("Invalid Username & Password!");
		            
			    }
			 }
 }
	}
}
}

			 


	

