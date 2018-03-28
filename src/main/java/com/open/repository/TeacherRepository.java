package com.open.repository;

import com.open.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    @Query("select t from Teacher t where t.id = :id")
    public Teacher findById(@Param("id") Long id);

}
