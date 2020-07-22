package com.yyq.jpa.service;

import com.yyq.jpa.entity.Student;

import java.util.List;

/**
 * @author yyq
 * @date 2020/7/10
 */
public interface StudentService {
    void insert(Student student);
    Student findBySnameLikeAndClass(String sname, String sclass);
    Student findBySnameLike(String sname);
    Student findBySno(Long sno);
    List<Student> findBySclass(String sclass);
    void update(Student student);
}
