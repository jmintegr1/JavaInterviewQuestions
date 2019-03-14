package interviewQuestions;

public class SwapString {

	public static void main(String[] args) {

		
		String a = "Hello";   //****IQ: How will you swap the two String variables without using 3rd variable? (Third variable is only feasible)
		String b = "World";
		
		
		System.out.println("Before swapping: ");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
				
				
		//1st Step. Append a and b to merge:
		
		a = a + b; 
		
		
		System.out.println("*****************");
		
		
		
		System.out.println(a);  //HelloWorld
		
		//2nd Step. Store initial string a in String b:
		b = a.substring(0, a.length()-b.length());        //.substring(beginIndex, endIndex) Method
	   //Since now a = HelloWorld  from a.length above appending then - (minus) b.length which is World (line 9) but after deduction now b = Hello
		
		System.out.println(b); //Hello
		
		
		System.out.println("*****************");

		
		//3rd Step. Store EVOLVED String b in String a:
		a = a.substring(b.length());  //Substring has two parameters but we are passing only one   
		//After above swap now b is Hello so this time b.length()); stores b in a = World

		System.out.println("The value of a and b after swapping");
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
	
		
	}

}
