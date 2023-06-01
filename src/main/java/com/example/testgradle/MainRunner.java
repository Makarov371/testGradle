package com.example.testgradle;

import com.example.testgradle.dto.Animal;
import com.example.testgradle.dto.Tiger;
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

    }

    private FindService getService(Integer number) {
        if (number == 1) {
            return findServiceImpl1;
        } else {
            return findServiceImpl2;
        }
    }
}
