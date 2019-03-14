package interviewQuestions;

public class SwapWithOutThridOrTempVar {

	public static void main(String[] args) {

		//Swap the two INT variables 
		int x = 5; //0101
		int y = 10; //1010  
		
		//x = 10, y = 5;
		
		//1. Here with using third/temp variable: t
//		int t;
//		
//		t = x; //5
//		x = y; //10
//		y = t; //5
//		
//		
//		//2. Now we don't want to use (temp/3rd) variable, so how do I do we do that?   Ans: By using + (plus operator) we can swap 
//		x = x + y; //15
//		y = x - y; //5
//		x = x - y; //10   //No temp variable but we are still swapping w/ math 
		
		
		
		//3. Without using 3rd var: so using * (product operator)
//		x = x * y; //50
//		y = x / y; //5
//		x = x / y; //10 
		
		
		//4. Using ^ (XOR.. pronounced Zor operator)
		x = x ^ y;   //15 --> 1111
		y = x ^ y;  // 10 --> 1010
		x = x ^ y; //5 --> 0101
			
		
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
