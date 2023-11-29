package com.example.studentmanage.controller;

import com.example.studentmanage.model.Student;
import com.example.studentmanage.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@Api(tags = "学生管理")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "学生信息", notes = "学生信息")
    @GetMapping("selectAll")
    public List<Student> selectAll() {
        return studentService.selectAll();
    }

}
