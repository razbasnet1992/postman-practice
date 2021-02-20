package com.spring.bootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//configuration-manual spring configuration-can be done in a java class itself instead of xml file
///enableautoconfiguration-configuration is done automatically
//componentscan-tells spring where to scan for componnents
public class BootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApiApplication.class, args);
    }

}
