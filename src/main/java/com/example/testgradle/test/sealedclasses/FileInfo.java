package com.example.testgradle.test.sealedclasses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileInfo {

    private String name;
    private String originalFileName;
    private Long size;

    private byte[] bytes;
}
