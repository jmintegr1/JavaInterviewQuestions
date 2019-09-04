package interviewQuestions;

public class MissingNumber {

	public static void main(String[] args) {
		//IQ: How will you figure out missing # in an Array?
		
		//int a[] = {1,2,4,5};  Which # is missing?
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		//15-12 = 3 
		
		
		//int a[] = {1,2,4,5},6,7,8,9...........100;  ***IQ Which # is missing from this big array? This time finding out the missing number will require more
		//because the list of number is bigger and we don't want to manually count and check. We also want to do it by logic. 
		
		//int a[] = {2,3,4,5,6,7,8,9,10}; //#s have to be in sequence then a missing #, so add all of them except the missing#
		
		int a[] = {1,2,4,5};   //Need to do boundary analysis so test with missing last# 10, or first #1, finally middle # like 6 or combo can be done as well
		
		int sum = 0; //Since adding integer from array, we are using "SUM" so start w/ = 0 as the starting point of []
		
		         //Array always start w/ Zero  
		for(int i = 0; i<a.length; i++) { //.length() function (size of array) & is how many time we'll do the increment, since array length is 4 so the loop will increment 4x by adding each of the index value
			sum = sum + a[i]; //Sum should be 12 now
		}
		
		System.out.println(sum);
		
		int sum1 = 0;  //Since adding we are using integer SUM start w/ = 0
		
		//When doing complete boundary addition then it is j<= largest # of the boundary
		
		//starting from 1 so j = 1
		for(int j=1; j<=5; j++) {  //Here we have all the numbers totaled by having the first # of the boundary and the largest# <=5 , so this includes the missing # in the total automatically
			sum1 = sum1 + j;  //15
		}
		
		System.out.println(sum1);
		
		System.out.println("missing number is::: " + (sum1-sum));
		
		System.out.println("******************");
		
		

		        //Missing # is 6 (When doing Boundary Analysis put 6 back in and take whatever # I want to then run it) 
		
		int b[] = {1,2,3,4,5,7,8,9,10}; //If we want to do boundary analysis so test with missing last# 10, or first #1, or take out any middle # like 6 whatever middle # and run it..
		
		//int b[] = {-1,0,1,2,4,5,7,8,9,10}; //This is a sequence as well, if you use -1 to start then you'll have to k=-1 in line 57
		
		int sum2 = 0; //Array always start w/ Zero  
		
		for(int n = 0; n<b.length; n++) { //.length function is how many time we'll do the increment, since array length is 1 so the loop increments by 10x & all the index
			sum2 = sum2 + b[n]; //49
		}   
	                           
		System.out.println(sum2);
		
		
		int sum3= 0; 
		//Starting from 1 so k = 1
		for(int k=1; k<=10; k++) { //Here this loop adds Complete sequence 1,2,3,4,5,6,7,8,9,10 all the numbers that's why 1 compares to <= 10
			sum3 = sum3 + k; //55
		}
		
		System.out.println(sum3);
		
		System.out.println("The missing number is:: " + (sum3-sum2));  //Last step subtraction bet the 2 sums  
		 
	             //3 Steps to missing number. 
		        //1. First add all the #s given from the array, not knowing which one is the missing # with for loop
		       //2. Then Add all # in sequence, this time including the missing # by putting the 1st & last of the boundary in the loop
		      //3. Deduct all #s of the sequence total from given array total = missing number
	}
}
