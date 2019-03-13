package interviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here, so soggy now";  
		String str1 = "The rains Have started here, so soggy now";  //If we change one character to capital then string comparison will return false cuz Java is case sensitive  
                              //H is capital 
		
		//**IQ: How will you get the length of a string? Ans: I will use str.length() method for String.   | str.size is for array list or list object, NOT for String
		System.out.println(str.length());  //.length is used to count the # of characters, this counts zero as 1 = 44, without it array = 27
     
		System.out.println(str.charAt(6)); // IQ: How will you get specified character? Ans: Character@ will return char value at specified index so we have to pass the index to get the character. 
		
		//What is the index of particular character.. say index of S? (1st occurrence of S)
    	System.out.println(str.indexOf('s')); //I use indexOf and pass in the character which will give the index of... 
		
		//What is the index of second S?
		System.out.println(str.indexOf('s', 9)); //We want to count from the 9th position, after 8th as that's occupied by 1st S, including SPACE (has it's own index)
		//This way is hard coding to find 2nd Occurrence of s 
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));  //2nd Occurrence of s     | **IQ: Or Give me the 3rd or 4th occurrence of S index?
		
		//Find index of String?
		System.out.println(str.indexOf("here"));  //Similar to finding character, except use single quote for character and double quote for string.
		
		//What will you get if try to get index of string or character that does not exist?
		System.out.println(str.indexOf("hello MoFO"));
		
		System.out.println(str.indexOf('z'));  //-1 is useful in selenium because it means it is not available and if it is greater than -1 then we can put assertion 
		
		//String comparison: very popular ****IQ
		System.out.println(str.equals(str1)); //How will you compare two different strings are equal or not?
		
		//If we want to suspend Java's case sensitivity then use .eqalsIgnoreCase
		System.out.println(str.equalsIgnoreCase(str1));
		
		//How will get substring, say just get "The rains"?
		System.out.println(str.substring(4, 9));   //I will use substring(beginIndex, endIndex) method   | I have to include 1 more index beyond the last character of string I WANT, the very last one is NOT included .
		         //T is on zero index so 0
		
		System.out.println(str.substring(0, 9));
		
		//Trim method:
		String s = "   Hello Beautiful World   ";
		System.out.println(s.trim());  //Trim method will trim away the space before and after string, NOT in between
		
		//Replace method 
		System.out.println(s.replace(" ", " "));  //To take out the space in between strings use replace(oldChar, newChar) method  | I CAN'T seem to run though
		
		String date = "03-14-19"; //I want it like this 03/14/2019 so use replace(oldChar, newChar) method
		System.out.println(date.replace("-", "/"));
		
		//Split method:
		String test = "Hello_World_Test_Selenium";  //How do you just take out the underscore from String?
		String testval[] = test.split("_");  //Have to store in Tvalue[] array or it will give you error 
		for(int i = 0; i<testval.length; i++);
			//System.out.println(testval[i]);			//CAN'T SEEM TO FIX THIS	
			
		String s2 = "cares";   //How will you concatenate different strings or character
		System.out.println(s2.concat("s"));
		
		String x = "Hello";        //How will manipulate strings?
		String y = "World";
			int a = 100;
			int b = 300;
			
			
					
			
		System.out.println(x+y);      
		System.out.println(a+b);
		System.out.println(x+y+a+b); //Most think it is HelloWorld400, which is Incorrect. Cuz it is concatenated from left to right since int is behind String then it does NOT get added but put behind String
		System.out.println(a+b+x+y); //Now it is 400 (addition first) since int is first  then concatenate the Strings
		System.out.println(x+y+(a+b)); //This time it will add first as it follows math rule and then concatenate the Strings while respecting String as it prints them first then shows result of addition 
		
		
		double c = 12.3;
		double k = 10.5;
		
		System.out.println(a+b+c+k);
		System.out.println(x+y+c+k);
		System.out.println(x+y+(c+k));
		
		
		
	
	}

}
