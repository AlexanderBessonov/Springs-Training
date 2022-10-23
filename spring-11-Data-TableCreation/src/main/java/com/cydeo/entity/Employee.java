package com.cydeo.entity;

import jdk.jfr.Name;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private  String name;


}
