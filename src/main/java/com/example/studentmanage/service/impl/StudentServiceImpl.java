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
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        List<Student> studentList = studentMapper.selectAll();
        return studentList;
    }
}
