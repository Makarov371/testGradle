package com.example.testgradle.test.findservicelogic;

import org.springframework.stereotype.Component;

@Component
public class FindServiceImpl1 implements FindService{

    @Override
    public void say() {
        System.out.println("find1");
    }
}
