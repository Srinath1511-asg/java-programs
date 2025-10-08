package javalab;

import java.io.*;

public class FileCopyDemo {
	 public static void main(String[] args) {
	 try (FileInputStream in = new FileInputStream("D:\\sri.txt");
	 FileOutputStream out = new FileOutputStream("D:\\copy.txt")) {
	 int byteContent;
	 while ((byteContent = in.read()) != -1) {
	 out.write(byteContent);
	 }
	 System.out.println("File copied successfully!");
	 } catch (IOException e) {
	 System.out.println("An error occurred: " + e.getMessage());
	 }
	 }
	}