package com.example.testgradle;

import com.example.testgradle.mapper.CatMapper;
import com.example.testgradle.test.sealedclasses.TestObjectMapper;
import com.example.testgradle.test.sealedclasses.gitreverttest.TestYml;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class MainRunner implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        Objects.nonNull(null);

    }
}
