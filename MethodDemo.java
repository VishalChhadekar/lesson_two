package lession_two;

class MethodRepresentation{
	
	public   void  Calculator() {
		int a = 10;
		float f = 5.5f;
		System.out.println("Addition: "+ a+f);
		System.out.println("Subtraction: "+ (a-f));
		System.out.println("Mulitplication: "+ a*f);
		System.out.println("Division: "+ a/f);
		
	}
	public  void printDetails(String name, double mob ) {
		System.out.println("Name of the person: "+ name +" and mobile Number: "+ mob);
	}
	
	public  int Addition(int a, int b) {
		return a+b;
	}
		
}

 class Method1 {
	
	int val=150;//this won't get updated

	int operation(int val) { //pass by value
		val =val*10/100; //Preference is given to the local variable, thus modification only done for 
							//local variable (var)
		return(val);
	}
	
	int operation2(int val) {
		this.val =val*10/100;
		return(val);
	}

 }

public class MethodDemo {

	public static void main (String args[]) {
		
		MethodRepresentation mr = new MethodRepresentation();
		//First: 
		//method calling
		mr.Calculator();
		
		//second: Passing arguments to the method
		mr.printDetails("Sampel", 85858585);
		
		//getting return from the method
		int result = mr.Addition(2, 5);
		System.out.println(result);
		
		//method demo: Passing by value/Call by value
		Method1 d = new Method1();
		System.out.println("Before operation value of data is "+d.val);//150
		d.operation(100);
		System.out.println("After operation value of data is "+d.val);//150 (same)
		
		//Passing by reference
		System.out.println("Before operation value of data is "+d.val);//150
		d.operation2(100);
		System.out.println("After operation value of data is "+d.val);//10

	
	}

}
