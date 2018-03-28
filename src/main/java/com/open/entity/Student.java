package com.open.entity;

import javax.persistence.*;

@Entity
@Table(name="tb1_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private  String code;

    @ManyToOne(cascade={CascadeType.MERGE,CascadeType.REFRESH}

            ,optional=false)//是否可选，也即数据库中是否可以使null
    @JoinColumn(name="teacher_id")
    private  Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
