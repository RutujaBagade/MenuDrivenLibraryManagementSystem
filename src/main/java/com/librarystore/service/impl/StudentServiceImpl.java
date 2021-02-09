package com.librarystore.service.impl;


import java.util.List;

import com.librarystore.beans.Student;
import com.librarystore.dao.IStudentDao;
import com.librarystore.dao.impl.StudentDaoImpl;
import com.librarystore.service.IstudentService;

public class StudentServiceImpl implements IstudentService {

	IStudentDao studentDao=new StudentDaoImpl();

	@Override
	public void addStudent(Student student) {
		
          studentDao.saveStudentInfo(student);
          
	}

	@Override
	public void viewStudents() {
		// TODO Auto-generated method stub
		List<Student> students=	studentDao.getAllStudents();
		if(students!=null)
		{
			students.forEach(System.out::println);
		}
		else
		{
			System.out.println("No Students are registered yet");
		}
				
	}

	@Override
	public Student searchById(int studentID) {
		// TODO Auto-generated method stub
		return studentDao.findById(studentID);
	}

}