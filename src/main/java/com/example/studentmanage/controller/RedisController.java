package com.example.studentmanage.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "查询学生")
public class RedisController {
    //@Autowired
    //private RedisUtils redisUtils;
    //@Autowired
    ////private StuService stuService;
    //
    //@RequestMapping("setAndGet")
    //public String test(String k, String v) {
    //    redisUtils.set(k, v);
    //    return (String) redisUtils.get(k);
    //}

    //@RequestMapping("test")
    //public Object test() {
    //    //step1 先从redis中取
    //    String strJson = (String) redisUtils.get("stuCache");
    //    if (strJson == null) {
    //        System.out.println("从DB取值");
    //        // step2如果拿不到则从DB取值
    //        List<Student> listStudent = stuService.ListStudent();
    //        // step3 DB非空情况刷新redis值
    //        if (listStudent != null) {
    //            redisUtils.set("stuCache", listStudent);
    //            return listStudent;
    //        }
    //        return null;
    //    } else {
    //        System.out.println("从redis缓存取值");
    //        return JSONObject.parseArray(strJson, Student.class);
    //    }
    //}
}
