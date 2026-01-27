package com.junit.com;
import java.io.*;
public class FileProcessor {
	
	public void writeToFile(String filename, String content) throws IOException {
		// FileWriter is used to write character data to a file
        FileWriter writer = new FileWriter(filename);
        writer.write(content); // write content
        writer.close(); 
		
	}

	public String readFromFile(String filename) throws IOException {
	 BufferedReader reader = new BufferedReader(new FileReader(filename));
     StringBuilder content = new StringBuilder();
     String line;

     // Read file line by line
     while ((line = reader.readLine()) != null) {
         content.append(line);
     }

     reader.close();
     return content.toString();
		
	}

}
