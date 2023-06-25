package com.example.testgradle;

import com.example.testgradle.dto.Animal;
import com.example.testgradle.dto.Tiger;
import com.example.testgradle.test.TestAbstr;
import com.example.testgradle.test.findservicelogic.FindService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner {

    private final FindService findServiceImpl1;
    private final FindService findServiceImpl2;
    private final AnimalRepository animalRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("test");
    }

    private void buildTestAbstr(TestAbstr testAbstr) {

    }
}
