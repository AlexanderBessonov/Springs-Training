package com.cydeo.bean_annotation.motherboardfactory;

import com.cydeo.bean_annotation.PC;
import com.cydeo.bean_annotation.casefactory.Case;
import com.cydeo.bean_annotation.config.ComputerConfig;
import com.cydeo.bean_annotation.monitorfactory.Monitor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;

public class ComputerTest {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, Random.class);

       Monitor theMonitor = container.getBean(Monitor.class);

      Case theCase = container.getBean(Case.class);

       Motherboard theMotherboard = container.getBean(Motherboard.class);

        PC myPc = new PC(theCase, theMonitor, theMotherboard);

        myPc.powerUp();
    }
}
