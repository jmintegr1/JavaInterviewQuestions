package interviewQuestions;

public class PrimeNumber {
	//2 is the SMALLEST prime number (Any # that Cannot be divided by another # and having remainder = 0)
	//3  also prime # ... SO ODD #
	
	// 1 & 0 are NOT prime # (Aka Corner/Edge case)
	// -1, -2 are NOT prime # so no Negative #s
	// num = 20; //(Find out how many prime numbers are available in 20?)
	
	

	//13/13  Prime # It can be only be divisible by itself or 1, NOT w/ another number w/ remainder = 0 
	//13/2   13 CANNOT be divisible by 2 or other number
	//17/17  17 also cannot so it's a prime#  SO ODD #s are Prime #
	
	
	//4 4/2 4/4              These 3 are NOT prime numbers because remainder = z (Even # are not Prime #)
	//10                      
	//10 10/2 10/5 10/10
	
	
	public static boolean isPrimeNumber(int num) {  //Make static method so I can call it without making an object @line 52
		
		//Set the edge/corner cases:
		if(num<=1) {
			return false;
		}
		
		for(int i=2; i<num; i++){
			if(num % i == 0) { //It means remainder has to be 0
				return false;
			}
		}
		return true;
	}
	
	       //This method is static so I can call it directly without making an object @ line 60 & below
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {  //Start w/ 2 cuz it's the smallest prime #
			if(isPrimeNumber(i))     //If the above 2 methods are false then it will NOT come inside IF condition, so will not be printed. If it is true then it will come here and print as prime #
				System.out.println(i + " "); //if No LN because I want result to print in the same line
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		                                            //isPrimeNumber logic line 23
		System.out.println("2 is a prime number: " + isPrimeNumber(2)); //Now we are calling to check if it is a prime # or not
		System.out.println("3 is a prime number: " + isPrimeNumber(3));
		System.out.println("10 is a prime number: " + isPrimeNumber(10));
		System.out.println("17 is a prime number: " + isPrimeNumber(17));
		System.out.println("4 is prime number: " + isPrimeNumber(4));

		System.out.println("**************");

		System.out.println("Is 0 is prime number: " + isPrimeNumber(0));
		System.out.println("Is 1 is prime number: " + isPrimeNumber(1));
		System.out.println("Is -2 is prime number: " + isPrimeNumber(-2));   //Negative integers are NOT Prime #
		System.out.println("Is -3 is prime number: " + isPrimeNumber(-3));

		//Method called getPrimeNumbers()from line 39
		getPrimeNumbers(7); //# Passed in parameter is the highest range, so between 2-7 give me all the prime numbers?
		
		System.out.println("**********");

		getPrimeNumbers(13);
		
		System.out.println("**********");

		getPrimeNumbers(20); //The highest range here is 20 so all prime # in between?
		
		System.out.println("**********");
		
		getPrimeNumbers(100);  //Give me all prime numbers from 1-100?
		
		
		
		
		//1. ***IQ for prime number:  Write down the program to find out prime number? 
		
		//2. ***IQ for prime number: Where the given number is there and give me all the use cases, give me all the test 
		//cases that your function or whatever the method logic you have written is accurate for all data?
		
	}

}
