package com.imooc.ad.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


@Slf4j
public class TestWriteFile {
    @Test
    public void testWriteFile() {
        String fileName = "C:\\Users\\inz\\Desktop\\test";
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(fileName))) {
            writer.write("test txt");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
