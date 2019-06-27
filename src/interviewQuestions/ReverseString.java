package interviewQuestions;           //IQ: How will you reverse a String?
                                     //IQ: Difference between String & StringBuffer?
public class ReverseString {        //IQ: Do we have reverse function in String?   Ans: NO cuz String is NOT immutable 

	public static void main(String[] args) {    //String is NOT a mutable class (it's IMMUTABLE) that's why reverse (rev) function/method is not available in string

		String s = "Selenium";
		
		//1st way: Using for loop
		 
		int len = s.length(); //Get length of  the String so declare integer length variable w/ length() method
		                       //8 is the length but we count as array, since S = 0 so the 7th location is m
		
		String rev = " "; //Define a blank variable here so rev is blank therefore it can store the reverse strings from the loop in line 18
		         
		                    //8-1 = 7 so loop starts from m
			               //0 = S since we are ending at S which is the Zero location
		for(int i = len-1; i>=0; i--) {  //To reverse means going from highest to lowest so use decrement 
			rev = rev + s.charAt(i);  //Now rev starts storing the the value so = 1st is m, then u, and so on... ineleS
		}               //chartAT() method gives the value of that specific index of CHARACTERS after passing in the (I)
		
		System.out.println(rev); //Always print outside of the for loop block, if printed inside it's a mess
		                                                                                                                                                                                                                                                                                                                                                                                    
		
		//2nd Way: Using StringBuffer class, already available in Java
		
		StringBuffer sf = new StringBuffer(s);  //A. StringBuffer is a mutable class so instantiate it by itself then
		
		System.out.println(sf.reverse());       //B. Then we can call StringBuffer's reverse (rev)function	
		
		
		//These two also works: instantiation inside PLS
		
		System.out.println(new StringBuffer(s).reverse());
		
		
	}
}
