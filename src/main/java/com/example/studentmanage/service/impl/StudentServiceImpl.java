package com.example.studentmanage.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.studentmanage.mapper.StudentMapper;
import com.example.studentmanage.model.Student;
import com.example.studentmanage.service.StudentService;
import com.example.studentmanage.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private RedisUtils redisUtils;
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> selectAll() {

        String strJson = (String) redisUtils.get("studentListCache");
        if (strJson == null) {
            System.out.println("从DB取值");
            // step2如果拿不到则从DB取值
            List<Student> studentList = studentMapper.selectAll();
            int i = 0;
            for (Student student : studentList) {
                if (student.getStudentSex().equals("1")) {
                    student.setStudentSex("男");
                } else {
                    student.setStudentSex("女");
                }
            }
            // step3 DB非空情况刷新redis值
            if (studentList != null) {
                redisUtils.set("studentListCache", JSON.toJSONString(studentList));
                return studentList;
            }
            return null;
        } else {
            System.out.println("从redis缓存取值");
            return JSONObject.parseArray(strJson, Student.class);
        }

    }
}
