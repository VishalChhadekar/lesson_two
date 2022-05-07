package lession_two;

class Student{
	public String name;
	public int rollNum;
	//default constructor
	Student(){
		System.out.println("Name: "+name + " Roll number: " + rollNum);
	}
	
	//Parameterized constructor
	Student(String name, int rollNum){
		this.name = name;
		this.rollNum = rollNum;
		System.out.println("Name: "+name + " Roll number: " + rollNum);
	}
	
}

class Temp{
	
//	default constructor
	Temp(){
		this(3, 4); //constructor call must be first statement
					//constructor chaining
		System.out.println("This is a default constructor of class Temp");
		
	}
	Temp(int a, int b){
		System.out.println("This is parameterised constructor,\n"
				+ "being called by the default constructor of same class");
	}
}

public class ConstructorDemo {
	public static void main(String args[]) {
		Student obj = new Student("Sample", 12);
		
//		Constructor Chaining
		Temp t = new Temp();

		
	}

}
