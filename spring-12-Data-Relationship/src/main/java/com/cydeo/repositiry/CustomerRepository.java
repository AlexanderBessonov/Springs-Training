package com.cydeo.repositiry;

import com.cydeo.entity.Cart;
import com.cydeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
