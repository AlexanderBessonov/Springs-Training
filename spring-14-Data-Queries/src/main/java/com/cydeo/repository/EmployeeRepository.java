package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

    //Display All employee with address
    List <Employee> findByEmail (String email);

    //Display all employees with firstName and lastName
    // also show all employee with an email address
    List <Employee> findByFirstNameAndLastNameOrEmail (String firstName, String lastName, String email);

    //Display all employees that first name is NOT
    List <Employee> findByFirstNameNot (String email);




}
