package com.yyq.jpa.repository;

import com.yyq.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author yyq
 * @date 2020/7/10
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Long>, JpaSpecificationExecutor<Student>, CrudRepository<Student,Long> {
    List<Student> findBySnameLikeAndSclass(String sname, String sclass);
    List<Student> findBySnameLike(String sname);
    List<Student> findBySno(Long sno);
    List<Student> findStudentsBySclass(String sclass);

    Optional<Student> findById(Long id);
    /*@Modifying
    @Query("update Student set ")
    void updateById(Long id);*/
}
