package lession_two;

//Method Overloading: Having same name, but differen't type or number of parameters.
class overloadingMethod{
	
	public void addition(int a,int b) {
		System.out.println("Addition: "+ (a+b));
	}
	
	public void addition(int a,int b, int c) {
		System.out.println("Addition: "+ (a+b+c));
	}
	public void area(int r) {
		System.out.println("The are of circle is "+ (3.14/4)*r);
	}
	public void area(int l, int b) {
		System.out.println("Area of rectangle is: "+ l*b);
	}
}

public class MethodOverloading {
	public static void main(String args[]) {
		
		overloadingMethod obj = new overloadingMethod();
		
		obj.addition(5, 7);
		obj.addition(7, 3, 12);
		obj.area(12);
		obj.area(4, 6);
	}

}
