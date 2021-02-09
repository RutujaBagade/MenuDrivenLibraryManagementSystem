package com.librarystore.dao;


import java.util.List;

import com.librarystore.beans.Student;

public interface IStudentDao {
	public void saveStudentInfo(Student student) ;
	public  List<Student> getAllStudents();
	public Student findById(int studentId);
}
