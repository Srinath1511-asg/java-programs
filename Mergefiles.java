package javalab;

import java.io.*;

public class Mergefiles {
	 public static void main(String[] args) {
		 try (BufferedReader br1 = new BufferedReader(new FileReader("D:\\Demmo.txt"));
		 BufferedReader br2 = new BufferedReader(new FileReader("D:\\copy.txt"))) {
		 System.out.println("Contents of file1.txt:");
		 String line=null;
		 while ((line = br1.readLine()) != null) {
		 System.out.println(line);
		 }
		 System.out.println("\nContents of file2.txt:");
		 while ((line = br2.readLine()) != null) {
		 System.out.println(line);
		 }
		 } catch (IOException e) {
		 System.out.println("An error occurred: " + e.getMessage());
		 }}

}
