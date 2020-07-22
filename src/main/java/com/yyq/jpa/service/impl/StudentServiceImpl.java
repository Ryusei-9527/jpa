package com.yyq.jpa.service.impl;

import com.yyq.jpa.entity.Student;
import com.yyq.jpa.repository.StudentRepository;
import com.yyq.jpa.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author yyq
 * @date 2020/7/10
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentRepository studentRepository;

    @Transactional
    @Override
    public void insert(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findBySnameLikeAndClass(String sname, String sclass) {
        return studentRepository.findBySnameLikeAndSclass("%"+sname+"%",sclass).get(0);
    }

    @Override
    public Student findBySnameLike(String sname) {
        return studentRepository.findBySnameLike("%"+sname+"%").get(0);
    }

    @Override
    public Student findBySno(Long sno) {
        return studentRepository.findBySno(sno).get(0);
    }

    @Override
    public List<Student> findBySclass(String sclass) {
        return studentRepository.findStudentsBySclass(sclass);
    }

    @Transactional
    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }
}
