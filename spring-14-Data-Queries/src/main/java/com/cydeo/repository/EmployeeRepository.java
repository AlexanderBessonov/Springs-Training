package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    List <Employee> findByEmailIsNull ();

    //************************************* JPQL or SQL *******************************************
    @Query("SELECT employee FROM Employee employee WHERE employee.email='amcnee1@google.es'")
    Employee retrieveEmployeeDetail();

    @Query("SELECT e.salary from Employee  e WHERE e.email='amcnee1@google.es'")
    Integer retrieveEmployeeSalary();

    //Not Equal <>
    @Query("SELECT e FROM Employee e WHERE  e.salary <> ?1")
    List <Employee> retrieveEmployeeSalaryNotEqual (int salary);

    //Like / Contains / Startswiths / Endswith //
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List <Employee> retrieveEmployeeFirstNameLike (String pattern);

    //Less Than
    @Query("SELECT e FROM Employee e where e.salary < ?1")
    List <Employee> retrieveEmployeeSalaryLessThan (int salary); //retrieve == some name

    //Greater Than only firstName
    @Query("SELECT e.firstName FROM Employee e where e.salary > ?1")
    List <String> retrieveEmployeeSalaryGreaterThan (int salary);

    //BETWEEN
     @Query("SELECT e FROM Employee e where e.salary between ?1 AND ?2")
    List <Employee> retrieveEmployeeSalaryBetween(int salary1, int salary2);

     //BEFORE
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")//<???
    List <Employee> retrieveEmployeeHireDateBefore (LocalDate date);

    //NULL
    @Query("SELECT e FROM Employee e where e.email is null ")
    List <Employee> retrieveEmployeeEmailIsNull ();

    //NOT NULL
    @Query("SELECT e FROM Employee e where e.email is NOT null ")
    List <Employee> retrieveEmployeeEmailIsNotNull ();

    //SORTING in Asc Order
    @Query("SELECT e FROM Employee e  ORDER BY e.salary ")
    List <Employee> retrieveEmployeeSalaryOrderAsc();

    //SORTING in Desc Order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List <Employee> retrieveEmployeeSalaryOrderDesc();

    //********************************** Native Query *************************************
    @Query(value = "SELECT * from employee WHERE salary = ?1", nativeQuery = true)
    List <Employee> retrieveEmployeeDetailBySalary (int salary);

     //******************************* Named parameter ************************************
     @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List <Employee> retrieveEmployeeSalary (@Param("salary") int salary);





}
