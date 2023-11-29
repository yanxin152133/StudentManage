package com.example.studentmanage.service.impl;

import com.example.studentmanage.mapper.StudentMapper;
import com.example.studentmanage.model.Student;
import com.example.studentmanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.SelectAll();
    }

    @Override
    public int updateStudentById(Student student) {
        return 0;
    }

    @Override
    public int insertStudentById(Student student) {
        return 0;
    }


    @Override
    public int deleteStudentbyId(int id) {
        return studentMapper.deleteStudentbyId(id);
    }
}
