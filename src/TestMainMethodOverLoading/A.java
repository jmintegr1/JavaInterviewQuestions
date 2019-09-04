package TestMainMethodOverLoading;

public class A {
	
	
	public static void main (String[] args) {   //Static method can be called by class name, so can be called from both methods
		
		System.out.println("A class Main Method");
		
        B.main(args);	
	
		
		//**** IQ: Can we call main() method from different class?  Ans: Yes we can because Main() is static by nature and inside 
        //A class, I can call B.main().... or I can also do the same from B class & call A.main()
		
		
		
	}


}
