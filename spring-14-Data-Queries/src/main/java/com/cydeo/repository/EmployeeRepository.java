package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

    //Display All employee with address
    List <Employee> findByEmail (String email);

    //Display all employees with firstName and lastName
    // also show all employee with an email address
    List <Employee> findByFirstNameAndLastNameOrEmail (String firstName, String lastName, String email);

    //Display all employees that first name is NOT
    List <Employee> findByFirstNameIsNot (String email);

    //Display all employees that last name starts with ""
    List <Employee> findByLastNameStartingWith (String pattern);

    //Display all employees with salaries higher than ""
    List <Employee> findBySalaryGreaterThan (Integer salary);

    //Display all employees with salaries less than ""
    List <Employee> findBySalaryLessThan (Integer salary);

    //Display all employees that has been hired between  "" and ""
    List <Employee> findByHireDateBetween (LocalDate startDate, LocalDate endDate);

    //Display all employees where salaries greater and equal to "" in order-salary
    List <Employee> findBySalaryGreaterThanEqualOrderBySalary (Integer salary);

    //Display top unique 3 employees than is making less than ""
    List <Employee> findDistinctTop3BySalaryLessThan (Integer salary);

    //Display all employees that who do NOT have email address
    List <Employee> findByEmailIsNull (String email);

    //************************************* JPQL or SQL *******************************************
    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();

    @Query("SELECT e.salary from Employee  e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not Equal <>
    @Query("SELECT e FROM Employee e WHERE  e.salary <> ?1")
    List <Employee> retrieveEmployeeSalaryNotEqual (int salary);

    //Like / Contains / Startswiths / Endswith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List <Employee> retrieveEmployeeFirstNameLike (String pattern);


}
