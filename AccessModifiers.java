package lession_two;

class Demo{
	public int n=10;
	private String name;
	protected char ch = 'C';
	
	Demo(){};
	Demo(String name){
		this.name = name;
		System.out.println("The constructor of the class Demo");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName () {
		this.name = name;
	}
	//method to print the name
	public void printName() {
		System.out.println(getName());
	}
}

public class AccessModifiers {
	public static void main(String arg[]) {
		
		
		Demo d = new Demo();
		System.out.println("public variable: " + d.n); 
		//as n is public, can be access directly 
		
		
		Demo d1 = new Demo("Sampel");
//		d.printName();
		System.out.println(d1.getName()); 
		//as the variable is private, we have to use getter and setter methods
		
	}

}
