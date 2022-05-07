package lession_two;


public class OuterClassDemo {

	 private String msg="Welcome to Java"; 
	 
	 class Inner{  
	  void hello(){
		  System.out.println(msg+", \nLet's start learning Inner Classes");
}  
	 }  


	public static void main(String[] args) {

		OuterClassDemo outerObj = new OuterClassDemo(); //created a obj, of outer class
		OuterClassDemo.Inner innnerObj = outerObj.new Inner();  
		//using name of outer class, we can access the inner class, 
		//to instantiate inner object we are using outer object and then used dot operator 
		//called the constructor of inner class
		innnerObj.hello();  
	}
}
