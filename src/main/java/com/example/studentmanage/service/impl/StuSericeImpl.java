package com.example.studentmanage.service.impl;

import com.example.studentmanage.dao.StuDao;
import com.example.studentmanage.model.Student;
import com.example.studentmanage.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StuSericeImpl implements StuService {
    @Autowired
    private StuDao stuDao;
    @Override
    public List<Student> ListStudent() {
        return stuDao.ListStudent();
    }
}
