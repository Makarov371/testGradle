package com.example.testgradle.test.sealedclasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public final class Dog extends MySealedClass{

    private String name;
}
