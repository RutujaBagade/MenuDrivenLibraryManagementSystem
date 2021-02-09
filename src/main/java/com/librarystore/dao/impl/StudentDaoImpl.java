package com.librarystore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.librarystore.beans.Student;
import com.librarystore.dao.IStudentDao;


public class StudentDaoImpl implements IStudentDao{
	//List acts as databse
	 public  static List<Student> students = new ArrayList<Student>();
       static
	 {
		 students.add(new Student(11,"Rutuja bagade","rutubagade9@gmail.com","9657927571","CSE","B.E"));
		 students.add(new Student(12,"Tushar Kdam","tum26594@gmail.com","8600805009","IT","MCA"));
		 
	 }
	 
	@Override
	public void saveStudentInfo(Student student) {
		// TODO Auto-generated method stub
		students.add(student);
		if(students.size()>2)
		{
			System.out.println("You are Succesfully Registered");
		}
	}


	@Override
	public List<Student> getAllStudents() {
		
		 List<Student> studentList=null;
		if(!students.isEmpty())
		{
			 return students;
		}
		
		return studentList;
	}

	@Override
	public Student findById(int studentId) {
		// TODO Auto-generated method stub
		Student student=null;
				
		student=students.stream()
						.filter(e -> e.getUserId()==studentId)
		            .findFirst().get();
		            return student;
	}

}
