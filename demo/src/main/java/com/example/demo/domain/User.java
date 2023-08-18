package com.example.demo.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name = "USER")
@Entity
@Data
@Accessors(chain = true)
public class User {
    /**
     * TABLE ID.
     */
    @Id
    @SequenceGenerator(name = "USER_ID_GENERATOR", sequenceName = "USER_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EVENT_ID_GENERATOR")
    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;
}
