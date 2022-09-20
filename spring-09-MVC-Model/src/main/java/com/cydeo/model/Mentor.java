package com.cydeo.model;

import com.cydeo.controller.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    String firstName;
    String lastName;
    int Age;
   Gender gender;
}
