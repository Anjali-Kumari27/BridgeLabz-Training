package com.streams.bytearray;

import java.io.*;

public class ImageByteArray {

    public static void main(String[] args) {

        String inputImage = "original.jpg";
        String outputImage = "copy.jpg";

        try {

            // Step 1: Read image file
            FileInputStream fis = new FileInputStream(inputImage);

            // Step 2: Write image data into ByteArrayOutputStream
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            // Convert to byte array
            byte[] imageBytes = baos.toByteArray();

            // Step 3: Read from byte array
            ByteArrayInputStream bais =
                    new ByteArrayInputStream(imageBytes);

            // Step 4: Write to new image file
            FileOutputStream fos =
                    new FileOutputStream(outputImage);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // Close streams
            fis.close();
            baos.close();
            bais.close();
            fos.close();

            System.out.println("Image copied successfully using ByteArray Streams.");

        } catch (IOException e) {
            System.out.println("Error while processing image.");
        }
    }
}

