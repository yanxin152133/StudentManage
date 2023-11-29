package com.example.studentmanage.service;

import com.example.studentmanage.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> selectAll();

}
