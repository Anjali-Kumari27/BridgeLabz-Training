package com.streams.datastreams;

import java.io.*;

public class StoreRetrieve {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\91743\\OneDrive\\Desktop\\student.dat";

		//Writing data to file
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName));

			// Student details
			int rollNo = 101;
			String name = "Anjali";
			double gpa = 8.5;

			// Write data
			dos.writeInt(rollNo);
			dos.writeUTF(name);
			dos.writeDouble(gpa);

			dos.close();
			System.out.println("Student data written successfully.");

		} catch (IOException e) {
			System.out.println("Error while writing data.");
		}

		//Reading data from file
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream(fileName));

			int rollNo = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			dis.close();

			System.out.println("\nStudent Details:");
			System.out.println("Roll No: " + rollNo);
			System.out.println("Name: " + name);
			System.out.println("GPA: " + gpa);

		} catch (IOException e) {
			System.out.println("Error while reading data.");
		}
	}
}
