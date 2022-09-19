package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class})
public class CydeoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CydeoApplication.class, args);
    }
    @RequestMapping("/ozzy")
    public String getHomePage2(){
        return "home.html";
    }

}
