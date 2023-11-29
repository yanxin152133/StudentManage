package com.example.studentmanage.service;

import com.example.studentmanage.mapper.StudentMapper;
import com.example.studentmanage.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<Student> selectAll();

    int updateStudentById(Student student);

    int insertStudentById(Student student);

    int deleteStudentbyId(int id);

}
