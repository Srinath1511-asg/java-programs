package javalab;

import java.util.HashSet;
import java.util.Iterator;

public class Hashmapdemo {
	public static void main(String[] args) {
		HashSet<String> a=new HashSet<String>();
		a.add("akhil");
		a.add("srikanth");
		a.add("north");
		a.add("dinesh");
		a.remove("akhil");
		System.out.println(a.isEmpty());
	
		HashSet<Integer> b=new HashSet<>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		
		Iterator<String> it=a.iterator();
		Iterator<Integer> it2=b.iterator();
		System.out.println("string data");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("integer data");
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}
	
}
