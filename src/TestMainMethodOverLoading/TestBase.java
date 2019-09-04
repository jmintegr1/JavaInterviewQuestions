package TestMainMethodOverLoading;

public class TestBase {
	
	//t2();
	//t2(int a)
	//t2(int a, int b)    This method is overloaded but can we overload MAIN method like below?
	

	
	//JVM will only look into main method with (Strings args[]) parameters & public static void 
	//If JVM does not find this main method then it will not execute your program.
 
	//If we comment out entire Main() method from line 15-24 then we can't even run cuz Java application will not show if we want to run
	
	public static void main(String[] args) { //String Array in parameter        
		System.out.println("main method #1");
		
		main("Selenium"); //This main will call MM #2 below
		main(30);        //Will call MM#3
		main(20,40);    //Will call MM#4 cuz it has 2 arguments, same as MM#4
		
		                  //IQ: Can we overload main method?
		
	}                   //Although all methods below are MAIN but the signature inside are different & this is allowed
	                   //Duplicate Methods: (when same method name with same # of parameter with identical signature inside) are NOT allowed
	
	public static void main(String args) {    //String normal parameter
		System.out.println("main method #2");      //JVM will NOT look into these methods because it does not have (String[] args) parameter in these 3 main methods below
	
	}
	
	public static void main(int a) { //Different
		System.out.println("main method #3");
	
	}
	
	public static void main(int a, int b) {   //Also different
		System.out.println("main method #4");
		
	
	}
	
}
