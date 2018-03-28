package com.open.controller;

import com.open.entity.Teacher;
import com.open.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/findById")
    @ResponseBody
    public String findById(@RequestParam(value = "id") Long id) {
        Teacher teacher = teacherService.findById(id);
        if ( teacher !=null) {
            return teacher.getName();
        } else {
            return "null";
        }
    }
}
