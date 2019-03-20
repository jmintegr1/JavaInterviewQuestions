package interviewQuestions;   //How will you remove junk or unwanted characters from a particular string?

public class RemoveUnwantedCharJunk {

	public static void main(String[] args) {

		String s = "!@#$%^&* latin string 1234567890";
		String s1 = "@%#^ I love Selenium automation testing !!#$%%^ as much as I love  *$#() manual testing )()&^ cuz that makes comple SDET";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		        //Must use ^ before the characters we want keep or it will exclude them as well 
		s = s.replaceAll("[^a-zA-Z0-9]", "");   
		System.out.println(s); //By ^ before the characters we keep those characters and exclude all other junk characters specified above  
		
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);  //We are applying replaceAll on the s or s1 cuz Strings are immutable object then storing in itself
	}

}
