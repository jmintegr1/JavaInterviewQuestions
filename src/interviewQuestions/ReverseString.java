package interviewQuestions;           //IQ: How will you reverse a String?
                                     //IQ: Difference between String & StringBuffer?
public class ReverseString {        //IQ: Do we have reverse function in String?

	public static void main(String[] args) {    //String is NOT mutable class that's why Rverse (rev) function is not available in string

		String s = "I study like David goggins";
		
		//1. Using for loop
		int len = s.length(); //8 is the length but we count like array, so S = 0 makes the 7th location = m
		
		String rev = " "; //Define a blank variable so first time rev is blank
		         
		       //8-1 = 7 then it starts from m
		for(int i =len-1; i>=0; i--) {
			               //0 = S since we are ending at S which is the Zero location
			rev = rev + s.charAt(i);                                                       //The value of rev = muineleS
		}               //Give me the value of that specific index
		
		System.out.println(rev); //Print ouf of the for loop, if printed inside it's a mess
		
		
		
		//2. Using StringBuffer class: 
		StringBuffer sf = new StringBuffer(s);  //A. StringBuffer is a mutable class
		System.out.println(sf.reverse());       //B. So StringBuffer has reverse (rev)function
		
		
	}

}
