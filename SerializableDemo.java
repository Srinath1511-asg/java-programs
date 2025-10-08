package javalab;


import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializableDemo {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\Av.text"))) {
//            out.writeObject(person);  // Serialize the object
         
        try {
        	FileOutputStream s=new FileOutputStream("D:\\North.text");
        	ObjectOutputStream out=new ObjectOutputStream(s);
        	out.writeObject(person);
        	   System.out.println("Object serialized to North.txt");
        	
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
