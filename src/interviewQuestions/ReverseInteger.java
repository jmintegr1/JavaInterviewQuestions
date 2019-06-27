package interviewQuestions;      //How will you reverse an integer?  2 Ways to do it below.. 

public class ReverseInteger {

	public static void main(String[] args) {

		//1. Using Proper Algorithm 
		
		long num = 12345; //54321 is what interviewer wants  
		long rev = 0;  //Use long instead of int for bigger range
		     
		        //Is NOT
		while(num != 0) {  //Condition = Start loop with num is NOT equal to zero until terminate the loop when num = 0    
			  
			                  // % is called Reminder, num reminder by 10
			rev = rev * 10 + num % 10;  //5432
			num = num / 10;    //% is reminder, means num reminder by 10
		}
		
		System.out.println("Reverse num is::" + rev);  //Must print out of the while loop
		
		
		
		//2. Using StringBuffer Method

		long num1 = 12345; //Since we don't have string above so use valueOf() method, which converts the int/num into String with double quote "12345"                 
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse()); //and now we can call .reverse() function so now we can reverse the "String"
			             //for integer reversal we instantiate inside 
		
		long num5 = 45678;
		
		
		System.out.println(new StringBuffer(String.valueOf(num5)).reverse());
		
		
		
		//MY MISTAKE LED TO REVERSING INTEGER, using the reverse STRING approach 
		
		int a1[] = {1,2,3,4,5};   //Also treating the numbers as a distinct element by separating them with comma like done in missing number
		
		int len = a1.length;    //Want to get length of array so i = len -1
		
		String rev1 = " ";    //Empty string variable to store the numbers as reverse it via loop
		
		for(int i= len-1; i>=0; i--) {  //i = len-1 because loop will start from the high number-1 cuz 1st index of array = 0
			
			rev1 = rev1 + a1[i];   //Here use [] because we used [] index above, this [] of i gives us index of each # and store, if String was used then use .charAT()
		}
		
		System.out.println(rev1);
		
	}
}
