package javalab;

import java.util.*;
class Student {
 String name;
 int marks;
 String grade;

 public Student(String name, int marks,String grade) {
     this.name = name;
     this.marks = marks;
     this.grade=grade;
 }

 @Override
 public String toString() {
     return name + " - " + marks+"  "+ grade;
 }
}

//We use Comparator to sort students by marks in ascending order
class MarksComparator implements Comparator<Student> {
 @Override
 public int compare(Student s1, Student s2) {
     return s1.marks - s2.marks; // Ascending order
 }
}

public class EnumerationComparatorDemo {
 public static void main(String[] args) {
     // Using Vector (Legacy Collection)
     Vector<Student> students = new Vector<>();
     students.add(new Student("srinath", 85,"B grade good"));
     students.add(new Student("srikanth", 100,"A+ grade: Topper of the university"));
     students.add(new Student("akhil", 88,"B grade good"));
     students.add(new Student("dinesh", 90,"A grade good"));
     students.add(new Student("North", 90,"A grade good"));

     // Using Enumeration to iterate over Vector
     System.out.println("Students (Before Sorting):");
     Enumeration<Student> e = students.elements();
     while (e.hasMoreElements()) {
         System.out.println(e.nextElement());
     }

     // Sorting using Comparator (Ascending Order)
     Collections.sort(students, new MarksComparator());

     // Displaying sorted students
     System.out.println("\nStudents (After Sorting by Marks - Ascending Order):");
     for (Student s : students) {
         System.out.println(s);
     }
 }
}
