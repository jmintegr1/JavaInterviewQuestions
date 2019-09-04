package interviewQuestions;

public class SwapString {

	public static void main(String[] args) {
		
		//This is how to swap String w/ 3rd variable
		
		
		String a = "Hello";   //****IQ: How will you swap the two String variables without using 3rd variable? (Third variable is only feasible)
		String b = "World";
		
		
		System.out.println("Before swapping: ");
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
				
				
		//1st Step. Append a and b to merge:
		
		a = a + b; 
		
		
		System.out.println("*****************");
		
		
		
		System.out.println("The value of a after appending: " + a);  //HelloWorld
		
		
		//2nd Step. Store initial string a in String b after deduction:
		
		b = a.substring(0, a.length()-b.length());  //.substring(starting Index, ending Index) Method
		              //0, is critical or it will not work, 
		//Substring "means" from exactly where you want to capture the substring, that's why H = 0, as is the 1st index of array..
		
		
	   //Since a = HelloWorld is larger after line 21, after - (deducting) b.length which is World, now value of A gets assigned to value of B so now B = Hello
		
		System.out.println("The value of updated b: " + b); //Hello
		
		
		System.out.println("*****************");

		
		//3rd Step: Store UPDATED String b in String a:
		
		a = a.substring(b.length());  //Substring has two parameters but we only need to pass one here, deleting the ending index pick just 1 index from the choice of methods
		
		//Because after the above swap, now b is Hello so this time b.length()); stores b in a = World

		System.out.println("The value of a and b after swapping w/out 3rd variable: ");
		
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		
		
		System.out.println("**************");
		
		
		
		//Here we are swapping with 3rd variable
		
		System.out.println("The value of c & d before swapping");
		String c = "Hello";
		String d = "World";
		
		System.out.println("Value of a: " + c);
		System.out.println("Value of b: " + d);
		
		System.out.println("**************");
		
		
		//Declare 3rd variable
		String e;  
		
		e = c;   //e holds the value of c
		c = d;  //Now c can takes the value of d
		d = e; //d takes the value from e 
		
		System.out.println("The value of c & d after swapping using 3rd variable");
		
		System.out.println("Value of c: " + c);
		
		System.out.println("Value of d: " + d);
	
	}

}
