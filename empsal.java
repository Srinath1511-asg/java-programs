package javalab;

import java.io.*;


import java.util.Scanner;

class Employee{
	String name;
	int id;
	double salary;
	public Employee(String name,int id,double salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	void display() {
		System.out.println("Employee Id "+id);
		System.out.println("Employee Name "+name);
		System.out.println("Employee salary "+salary);
	}
}
public class empsal {
	public static void main(String[] args) throws IOException,NumberFormatException {
		int i=0;		
//		Scanner s=new Scanner(System.in);
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));//"12"
		System.out.println("enter number of employees:");
		int n=Integer.parseInt(b.readLine());
		Employee[] employee=new Employee[n];
		while(i<n) {
	System.out.println("enter employee "+(i+1)+" details");
	System.out.println("enter employee id");
		int id=Integer.parseInt(b.readLine());
		System.out.println("enter name");
		String name=b.readLine();
		System.out.println("enter employee salary");
		double salary=Double.parseDouble(b.readLine());	
		employee[i]=new Employee(name, id, salary);
		System.out.println();
		i++;
		}
		i=0;
		while(i<n) {
			employee[i].display();
			i++;
		}	
	}
}
