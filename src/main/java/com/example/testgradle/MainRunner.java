package com.example.testgradle;

import com.example.testgradle.mapper.CatMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner {

    private final CatMapper catMapper;
//    @Value("${app.name}")
    public String name;

    @Value("${age2}")
    public Integer age2;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(name);
        System.out.println(age2);
    }
}
