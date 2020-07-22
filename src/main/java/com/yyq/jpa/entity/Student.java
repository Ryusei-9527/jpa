package com.yyq.jpa.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yyq
 * @date 2020/7/10
 */
@Entity
@Table(name = "ystu")
@Data
@ToString
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ystu_id_seq")
    @SequenceGenerator(name = "ystu_id_seq", sequenceName = "ystu_id_seq", allocationSize = 1)
    @Column(name = "id", insertable = false, nullable = false)
    private Long id;

    @Column(name = "sno")
    private Long sno;

    @Column(name = "sname")
    private String sname;

    @Column(name = "sclass")
    private String sclass;
}
