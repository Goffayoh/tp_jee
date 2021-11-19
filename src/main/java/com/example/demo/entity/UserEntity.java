package com.example.demo.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name="User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public long id;

    @Column
    public String firstName;

    @Column
    public String lastName;

}
