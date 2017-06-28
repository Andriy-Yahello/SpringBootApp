package com.lofongi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Lofongi on 28.06.2017.
 */
@SpringBootApplication
//to make shore spring initializesbeans, recognizes all annotations, configs
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
//started on port(s): 8080 (http)
//jackson jar makes json
