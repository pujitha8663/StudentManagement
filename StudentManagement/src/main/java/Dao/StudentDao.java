package Dao;

import java.util.List;

import com.model.Student;

public interface StudentDao {
  List<Student> getAllStudents();
  public void add(Student student);
}
