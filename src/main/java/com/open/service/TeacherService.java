package com.open.service;

import com.open.entity.Teacher;
import com.open.entity.User;
import com.open.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher findById(Long id) {
        Teacher teacher = null;
        try{
            teacher = teacherRepository.findById(id);
        }catch (Exception e){}
        return teacher;
    }
}
