package lession_two;

import java.util.*;

public class CollectionsDemo {
	public static void main(String args[]) {
		ArrayList<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(4);
		l1.add(5);
		
		//getting arraylist
		System.out.println("ArrayList Representation:");
		for(int i=0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		System.out.println("\n");
		//generic datatyped Arraylist
		ArrayList<Comparable> al = new ArrayList<>();
		al.add(3);
		al.add("String");
		al.add(2, 5.5f);
		System.out.println("Generic ArrayList Representaion:");
		System.out.println(al);
		System.out.println(al.get(2));//to get specified index element
		System.out.println("\n");
		//creating vector
		System.out.println("Vector Representation: v1");
		Vector<Integer> v1 = new Vector<>();
		v1.addElement(2); //add an element
		v1.addElement(0);
		v1.add(2, 7); //add element at specified index
		System.out.println(v1);
		
		 Collection<Integer> cs = new ArrayList<Integer>();
		 cs.add(3);
		 cs.add(6);
		 
		 v1.addAll(cs); //this method is used to append all the element from the collection
		 				//passed as parameter
		 System.out.println("V1 after appending cs");
		 System.out.println(v1);
		 System.out.println("The capacity of vector v1: "+ v1.capacity());//return the capacity of the vector
		System.out.println("\n");
			//LinkedList
			LinkedList<String> linkL = new LinkedList<>();
			linkL.add("First");
			linkL.add("Second");
			linkL.add("Third");
			System.out.println("Representation of LinkedList");
			for(String st: linkL) {
				System.out.println(st);
			}
			//creating hashset
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(101);  
		       set.add(null);  
		       set.add(102);
		       set.add(104);
		       System.out.println(set);

	}

}

