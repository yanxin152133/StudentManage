package com.example.studentmanage.mapper;

import com.example.studentmanage.model.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> SelectAll();

    int updateStudentById(int student);

    int insertStudentById(int student);

    int deleteStudentbyId(int id);
}
