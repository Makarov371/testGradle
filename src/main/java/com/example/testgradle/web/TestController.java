package com.example.testgradle.web;

import com.example.testgradle.dto.TestZone;
import com.example.testgradle.test.sealedclasses.FileInfo;
import com.example.testgradle.test.sealedclasses.MyMulti;
import com.example.testgradle.test.sealedclasses.TestObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final ObjectMapper objectMapper;

    @PostMapping("/success")
    public void testSuccess() {}

    @PostMapping("/testZone")
    public TestZone testZoneDateTime(@RequestBody TestZone testZone) {
        System.out.println(testZone);
        return testZone;
    }

    @PostMapping("/test-multi")
    public FileInfo getFileInfo(@RequestParam("file")MultipartFile multipartFile) throws IOException {
        return FileInfo.builder()
                .name(multipartFile.getName())
                .bytes(multipartFile.getBytes())
                .originalFileName(multipartFile.getOriginalFilename())
                .size(multipartFile.getSize())
                .build();
    }

    @GetMapping(value = "/test-multi-get")
    public MyMulti getMulti() throws IOException {
        TestObjectMapper testObjectMapper = new TestObjectMapper("1", 2);
        FileItem fileItem = new DiskFileItemFactory().createItem("file", null, false, "fkoesfk.json");
        try (InputStream in = new ByteArrayInputStream(objectMapper.writeValueAsBytes(testObjectMapper));
             OutputStream out = fileItem.getOutputStream()) {
            in.transferTo(out);
        } catch (Exception e) {
            System.out.println(e);
        }
        return MyMulti.builder()
                .multipartFile(fileItem)
                .build();
    }
}
