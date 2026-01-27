package com.junit.tests;

import org.junit.jupiter.api.Test;

import com.junit.com.FileProcessor;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
public class TestFileProcessor {
	FileProcessor processor = new FileProcessor();
    String filename = "testfile.txt";
    
    @Test
    void testWriteAndReadFile() throws IOException{
    	String data = "Hello I am Anjali";
    	processor.writeToFile(filename, data);       // write data into a file
        String result = processor.readFromFile(filename); // read data

        assertEquals(data, result);
    }
    
    //File exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException{
    	processor.writeToFile(filename, "File Exists Test");

        File file = new File(filename);
        assertTrue(file.exists(), "File should exist after writing");
    }
    
    //IOException when file does not exist
    @Test
    void testReadNonExistingFile() {
        assertThrows(IOException.class, () -> {
            processor.readFromFile("nofile.txt");
        });
    }

}
