package interviewQuestions;

public class MissingNumber {

	public static void main(String[] args) {

		//int a[] = {1,2,4,5};  Which # is missing?
		//1+2+3+5 = 12
		//1+2+3+4+5 = 15
		//15-12 = 3 
		
		
		//int a[] = {1,2,4,5},6,7,8,9...........100;  ***IQ Which # is missing from this big array? This time finding out the missing number will require more
		//because the list of  number is bigger and we don't want to manually count and check. We want to do it by also & logic. 
		
		//int a[] = {2,3,4,5,6,7,8,9,10}; //#s have to be in sequence then a missing #, so add all of them except the missing#
		
		int a[] = {1,2,4,5};   //Need to do boundary analysis so test with missing last# 10, first #1, finally middle # like 6
		int sum = 0; //Array always start w/ Zero  
		for(int i = 0; i<a.length; i = i + 1) { //.length function is how many time we'll do the increment, since array length is 4 so the loop increment 4x
			sum = sum + a[i]; //12
		}
		
		System.out.println(sum);
		
		
		int sum1= 0; 
		//Starting from 1 so j = 1
		for(int j=1; j<=5; j++) { //Here we are adding Complete sequence 1,2,3,4,5 that's why j compares to 5
			sum1 = sum1 + j; //15
		}
		
		System.out.println(sum1);
		
		System.out.println("missing number is:: " + (sum1-sum));  //Last step subtraction bet the 2 sums 
	
		System.out.println("*************************");
	
		
		int b[] = {-1,0,1,2,4,5,6,7,8,9,10};   //Need to do boundary analysis so test with missing last# 10, first #1, or any middle # like 6 or 8
		int sum2 = 0; //Array always start w/ Zero  
		for(int n = 0; n<b.length; n = n + 1) { //.length function is how many time we'll do the increment, since array length is 1 so the loop increments by 10x
			sum2 = sum2 + b[n]; //49
		}   
	                           
		System.out.println(sum2);
		
		
		int sum3= 0; 
		//Starting from 1 so k = 1
		for(int k=-1; k<=10; k++) { //Here we are adding Complete sequence 1,2,3,4,5,6,7,8,9,10 all the numbers that's why k compares to 10
			sum3 = sum3 + k; //55
		}
		
		System.out.println(sum3);
		
		System.out.println("missing number is:: " + (sum3-sum2));  //Last step subtraction bet the 2 sums  
		 
	             //3 Steps to missing number. 
		        //1.First add all the #s given from the array, not knowing which one is the missing # with for loop
		       //2. Then Add all # in sequence 
		      //3. Deduct all #s of the sequence total from given array total = missing number
	}
}
