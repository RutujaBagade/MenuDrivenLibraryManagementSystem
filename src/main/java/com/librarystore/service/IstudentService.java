package com.librarystore.service;


import java.util.List;

import com.librarystore.beans.Student;

public interface IstudentService {
	public void addStudent(Student student);
     public void viewStudents();
     public Student searchById(int studentID);
}
