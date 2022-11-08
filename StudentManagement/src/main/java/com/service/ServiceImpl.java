package com.service;

import java.util.List;

import com.model.Student;

import Dao.StudentDao;
import Dao.StudentImpl;

public class ServiceImpl implements Service{
  StudentImpl s = new StudentImpl();
	public List<Student> getAllStudents() {
		
		return s.getAllStudents();
	}

}
