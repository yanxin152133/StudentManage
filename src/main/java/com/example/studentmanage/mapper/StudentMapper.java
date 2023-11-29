package com.example.studentmanage.mapper;

import com.example.studentmanage.model.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> selectAll();

    //int updateStudentById(int student);
    //
    //int insertStudent(int student);
    //
    //int deleteStudentbyId(int id);
}
