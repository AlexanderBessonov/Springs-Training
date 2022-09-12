package com.cydeo.streotype_annotation.config;

import com.cydeo.streotype_annotation.casefactory.Case;
import com.cydeo.streotype_annotation.casefactory.DellCase;
import com.cydeo.streotype_annotation.monitorfactory.Monitor;
import com.cydeo.streotype_annotation.monitorfactory.SonyMonitor;
import com.cydeo.streotype_annotation.motherboardfactory.AsusMotherboard;
import com.cydeo.streotype_annotation.motherboardfactory.Motherboard;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.cydeo.streotype_annotation.config")
public class PcConfig {


}
