package interviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here, so soggy now";  
		
		String str1 = "The rains Have started here, so soggy now";  //If we change one character to capital then string comparison = [ equals() with S ] method will return false cuz Java is case sensitive (line 45)
                               //H is capital 
		
		//**IQ: How will you get the *length* or size of a String? Ans: I will use length() method for String.   | str.size is for Array list or list object, NOT for String!
		
		System.out.println(str.length());  //.length is used to count the total # of characters, this counts zero as 1 = 41, without it array = 27
     
		
		System.out.println(str.charAt(7)); // IQ: How will you get Specified character, say get n? (Answer lies within the question: charAt()
		//Ans: I will count, starting from 0 to the character I want, then pass in the index inside charAt() method will return char value of that specified index 
		
		//What is the "INDEX OF" particular character.. say index of S? (1st occurrence of S, answer lies within the question)
    	System.out.println(str.indexOf('s')); //I use indexOf() (asking for # of the index) and pass in the character which will give the index of... 

    	//What is the index of second occurrence of S?
		System.out.println(str.indexOf('s', 9)); //We want to count from the 9th position, after 8th as that's occupied by 1st S, including SPACE (has it's own index)
		//This way is hard coding to find 2nd Occurrence of S 
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //2nd Occurrence of s     | **IQ: Or Give me the 3rd or 4th occurrence of S index?
		                                                           //This is dynamic way to get the index of..
	
		System.out.println(str.indexOf('s', str.indexOf('s')+2));  //Can't seem to run 3 occurrence of s yet
		
		
		//Find "INDEX OF" String, say "here" from the above String?
		System.out.println(str.indexOf("here"));  //Similar to finding indexOf() character, instead of single quote for character, use "double quote" for string.
		
		//What will you get if you try to get index of string or character that does not exist?
		System.out.println(str.indexOf("hello MoFO")); //-1 
		
		
		System.out.println(str.indexOf('z'));  //-1 is useful in Selenium because it means, it is not available and if it is greater than -1 then we can put assertion 
	
		
		//String comparison: very popular ****IQ
		System.out.println(str.equals(str1)); //How will you compare two different strings that are EQUALs to or not? (Answer lies within the question)
	    //I will use equals() with s method
		
		//If we want to suspend Java's case sensitivity then use .eqalsIgnoreCase() method
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		
		//How will you get SUBSTRING, say just get "The rains"?  (Give me the word or words?)
		System.out.println(str.substring(0, 9)); 
		//I will use substring(beginIndex, endIndex) method   | I have to include 1 more index beyond the last character of string I WANT, the very last one is NOT included.
		
		System.out.println(str.substring(0, 14));  //"The rains have"
		
		System.out.println(str.substring(4, 9));   //Get me "rains" here
        //T is on zero index so 0
		
		System.out.println(str.substring(9, 14));  // Get "have"
		
		
		//Trim method:
		String s = "   Hello Beautiful World   ";  //How will you get rid of the extra space?
		System.out.println(s.trim());  //Trim method will trim away the space before and after string, NOT the sapce in between
		
		
		
		//Replace method                  //2nd index quotes make sure no space between the two quotes 
		System.out.println(s.replace(" ", ""));  //To take out the space in between strings use replace(oldChar, newChar) method w/ these 2 parameters
		
		String date = "03-14-19"; //I want it look like this 03/14/2019 so use replace(oldChar, newChar) method and use the character I want to replace the old character with
		System.out.println(date.replace("-", "/"));
		System.out.println(date.replace('-', '.'));
		//System.out.println(date.replace("-", "."));  //Replace w/ . 
		
		
		
		//Split method:
		String test = "Hello_World_Test_Selenium";  //How do you take out the underscore from String?
		String testval[] = test.split("_");  //Have to store in testval[] array or it will give you error cuz there are 4 values once underscores are removed
		for(int i=0; i<testval.length; i++) {  //Cuz of ; and not curly brace, I was not able to run it so you close loops with FUCKING CURVY BRACE {    !!!!!
		System.out.println(testval[i]);	  //Each loop it prints.. Think of SS split & stack		
		}	
		
		
		String s2 = "cares";   //How will you concatenate different strings or character? (Answer is within the question)
		System.out.println(s2.concat("s"));  //I will use concat() method (Basically how will you add s or 1 at the end)
		System.out.println(s2.concat("1"));
		System.out.println(s2.concat("honor"));

		
		String x = "Hello";        //****IQ: How will manipulate strings?
		String y = "World";
			int a = 100;
			int b = 300;
			
						
		System.out.println(x+y);      
		System.out.println(a+b);
		System.out.println(x+y+a+b); //Most think it is HelloWorld400, which is Incorrect. Cuz it is concatenated from left to right since int is behind String then it does NOT (mathematical formula is void) get added but put behind String
		System.out.println(a+b+x+y); //Now it is 400 (addition first) since int is first  then concatenate the Strings (now mathematical formula will work)
		System.out.println(x+y+(a+b)); //This time it will add first as it follows math rule and then concatenate the Strings while respecting String as it prints them first then shows result of addition 
		
		
		double c = 12.3;
		double k = 10.5;
		
		System.out.println(a+b+c+k);   
		System.out.println(x+y+c+k);
		System.out.println(x+y+(c+k));
		System.out.println(a+b+(c+k));
		
		
	}

}
