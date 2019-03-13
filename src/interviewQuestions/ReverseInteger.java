package interviewQuestions;      //How will you reverse an integer?  2 Ways to do it below.. 

public class ReverseInteger {

	public static void main(String[] args) {

		//1. Using proper algorithm 
		long num = 12345; //54321 is what interviewer wants  
		long rev = 0;  //Use long instead of int for bigger range
		
		while(num != 0) {  //Start loop with num is not equal to zero and terminate the loop when num = 0    
			  // % is Reminder, num reminder by 10
			rev = rev * 10 + num % 10;  //5432
			num = num / 10;    //% is reminder, means num reminder by 10
		}
		
		System.out.println("Reverse num is::" + rev);  //Must print out of the while loop
		
		//2. Using StringBuffer method

		long num1 = 12345; //Since we don't have string above use valueOf method, this converts the int into String with double quote "12345"                 
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse()); //and gives access to .reverse() function so now we can reverse the "String"
		
	}

}
