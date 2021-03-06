package com.java1234.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java1234.entity.Student;

/**
 * 学生信息Dao接口
 * @author 12580
 *
 */
public interface StudentDao extends JpaRepository<Student, Integer>{

}
