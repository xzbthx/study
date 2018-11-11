package com.mybatis.mappers;

import java.util.List;
import java.util.Map;

import com.mybatis.model.Student;

public interface StudentMapper {

	public List<Student> searchStudents(Map<String,Object>map);
	
	public List<Student> searchStudents2(Map<String,Object>map);
	
	public List<Student> searchStudents3(Map<String,Object>map);
	
	public List<Student> searchStudents4(Map<String,Object>map);
	
	public List<Student> searchStudents5(Map<String,Object>map);

	public int updateStudent(Student student);
	
	public int insertStudent(Student student);
	
	public Student getStudentById(Integer id);

}
