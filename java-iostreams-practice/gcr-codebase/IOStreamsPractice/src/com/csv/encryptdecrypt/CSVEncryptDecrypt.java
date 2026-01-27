package com.csv.encryptdecrypt;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.io.*;

public class CSVEncryptDecrypt {

    // AES key (for simplicity, generated once)
    private static SecretKey secretKey;

    static {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128); // AES 128-bit
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Encrypt a string
    public static String encrypt(String data) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    // Decrypt a string
    public static String decrypt(String encryptedData) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decoded = Base64.getDecoder().decode(encryptedData);
        byte[] decrypted = cipher.doFinal(decoded);
        return new String(decrypted);
    }

    // Write CSV with encrypted fields
    public static void writeCSV(String filePath) throws Exception {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            // Header
            writer.write("Name,Email,Salary");
            writer.newLine();

            // Sample data
            String[][] data = {
                    {"45", "Anjali", "CSE", "80000"},
                    {"48" , "shivani", "Commerce", "70000"}
            };

            for (String[] row : data) {
                // Encrypt Email and Salary
                String emailEnc = encrypt(row[1]);
                String salaryEnc = encrypt(row[2]);
                writer.write(row[0] + "," + emailEnc + "," + salaryEnc);
                writer.newLine();
            }
            System.out.println("CSV written with encrypted data.");
        }
    }

    // Read CSV and decrypt fields
    public static void readCSV(String filePath) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine(); // Skip header
            System.out.println("ID | Name | Department | Salary");
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                String name = row[0];
                String emailDec = decrypt(row[1]);
                String salaryDec = decrypt(row[2]);
                System.out.println(name + " | " + emailDec + " | " + salaryDec);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String filePath = "employees.csv";

        writeCSV(filePath);  // Encrypt and write
        System.out.println("\nReading CSV with decrypted data:");
        readCSV(filePath);   // Read and decrypt
    }
}

