package interviewQuestions;   //How will you remove junk, unwanted, or special characters from a particular string?

public class RemoveUnwantedCharJunk {

	public static void main(String[] args) {

		//1st Declare string variable 
		
		String s = "!@#$%^&* latin string 1234567890";

		String s1 = "@%#^ I love Selenium autmation testing !!#$%%^ as much as I love  *$#() manual testing )()&^ cuz that makes a complete SDET";

		
		//Ans: We use Regular Expression: [^a-zA-Z0-9] inside replaceAll()
		
		//2nd replaceAll() method to.. Must use one ^ before the Regular Expression (or characters) we want preserve or it will exclude them as well 
		s = s.replaceAll("[^a-zA-Z0-9]", " ");   //pick replaceAll(" " , " ") 2 options. " " Blanks are there to instruct replace with nothing 

		//Things we want to keep gets stored on the other side in s = or s1 = below
	
		//3rd Print by passing string reference variable
		System.out.println(s); //By ^ (carrot) before the characters we keep those characters and exclude all other junk characters shown above  

		s1 = s1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s1);  //We are applying replaceAll() on the s or s1 cuz Strings are immutable object then storing in itself
		
	}
}
