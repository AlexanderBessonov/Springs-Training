package com.cydeo.streotype_annotation.monitorfactory;

import org.springframework.stereotype.Component;

@Component
public class SonyMonitor extends Monitor{

    public SonyMonitor(String s, String aser, int i) {
        super("25 inch beast","Sony",25);
    }

    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
