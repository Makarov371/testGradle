package com.example.testgradle.mapper;

import com.example.testgradle.dto.Barsik;
import com.example.testgradle.dto.Cat;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CatMapper {

    Barsik toBarsik(Cat cat);
}
