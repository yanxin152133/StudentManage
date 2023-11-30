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

    @ApiOperation(value = "添加学生信息", notes = "添加学生信息")
    @GetMapping("insetStudent")
    public void insetStudent(Student student) {
        try {
            studentService.insertStudent(student);
            System.out.printf("添加学生信息成功\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "更新学生信息", notes = "更新学生信息")
    @GetMapping("updateStudent")
    public void updateStudentById(Student student) {
        try {
            studentService.updateStudentById(student);
            System.out.printf("更新学生信息成功\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ApiOperation(value = "删除学生信息", notes = "删除学生信息")
    @GetMapping("deleteStudent")
    public void deleteStudentById(int id) {
        try {
            studentService.deleteStudentById(id);
            System.out.printf("删除学生信息成功\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
