package com.yyq.jpa;

import com.yyq.jpa.entity.Student;
import com.yyq.jpa.repository.StudentRepository;
import com.yyq.jpa.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class JpaApplicationTests {
    @Resource
    private StudentService studentService;
    @Resource
    private StudentRepository studentRepository;

    @Test
    void contextLoads() {
        Student student = new Student();
        /*student.setSname("张起灵");
        student.setSclass("三年级二班");
        student.setSno((long) 1006);
        studentService.insert(student);*/

        /*List<Student> students = studentService.findBySclass("三年级四班");
        students.forEach(student -> System.out.println(student));

        System.out.println("***********************************");
        List<Student> list = studentRepository.findAll();
        list.forEach(student -> System.out.println(student));*/

        student = studentRepository.findById((long)5).get();
        student.setSname("韩菲");
        student.setSclass("三年级二班");
        studentService.update(student);
    }

}
