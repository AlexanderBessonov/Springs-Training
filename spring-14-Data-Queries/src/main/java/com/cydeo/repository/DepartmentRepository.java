package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository <Department, String> {

     //Display all  departments in the Furniture Department
    List<Department> findByDepartment (String department);

    //Display All departments in the Health Division
    List <Department> findByDivision (String division);
    List <Department> findByDivisionIs (String division);
    List <Department> findByDivisionEquals (String division);

    //Display All departments with division name ends with 'ics'
    List <Department> findByDivisionEndsWith (String pattern);

    //Display top 3 departments with division name includes 'Hea' without duplicates
    List <Department> findDistinctTop3ByDivisionContains (String pattern);

    //****************************************************************

    //Department from some division
    @Query("SELECT d from Department d WHERE d.division in ?1")
    List <Department> retrieveDepartmentDivision (List <String> division);


}
