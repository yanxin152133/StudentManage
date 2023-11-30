package com.example.studentmanage.mapper;

import com.example.studentmanage.model.Student;

import java.util.List;

public interface StudentMapper {


    List<Student> selectAll();

    int updateStudentById(Student student);

    int insertStudent(Student student);

    int deleteStudentbyId(int id);
}
