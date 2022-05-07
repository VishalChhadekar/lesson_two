package lession_two;


class innerclass1{
	private String msg = "Inner class";
	
	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  } 
		  Inner l=new Inner();  //inner class object
		  l.msg();  
		 }  
}

public class InnerClassDemo {
	public static void main(String args[]) {
		innerclass1  ob=new innerclass1 ();  
		ob.display();  

	}
}
//Con: Inner class (member class of an outer class) can access private member of outer class