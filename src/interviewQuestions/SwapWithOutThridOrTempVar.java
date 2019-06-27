package interviewQuestions;

public class SwapWithOutThridOrTempVar {

	public static void main(String[] args) {

		//Swap the two INT variables 
		int x = 5; //0101
		int y = 10; //1010  
		
		//I want to interchange the values so:  x = 10, y = 5;   
		
		//1. Here declare third/temp empty variable: t
		
		
		int t;
		
		t = x; //5  (T is basically holding the value of x to start the process...)
		x = y; //10
		y = t; //5
		
		
		
		
		//2. Now we don't want to use (temp/3rd) variable, so how do I do we do that?   Ans: By using + (plus operator) we can swap without 3rd variable
		
		x = x + y; //15    //Step 1: Start with getting the value of X = by adding X + Y 
		y = x - y; //5    //Step 2: Now get value of Y by = deducting the combined bigger X - Y (here do the opposite)
		x = x - y; //10  //Step 3: Get the value of X again with same formula as step 2: X - Y 
		
		//No temp variable but we are still swapping w/ math 
		
		
		
		//3. Without using 3rd variable: This time using * (product operator)
		
		x = x * y; //50  Step 1: Start with multiplying the two
		y = x / y; //5   Step 2: Now get the value of Y = (here do the opposite)
		x = x / y; //10  Step 3: Get the value of X one more time
		
		
		//4. Using ^ (XOR.. pronounced Zor operator)
//		x = x ^ y;   //15 --> 1111
//		y = x ^ y;  // 10 --> 1010
//		x = x ^ y; //5 --> 0101
//			
		
		System.out.println(x);
		System.out.println(y);
		
		
	}
}
