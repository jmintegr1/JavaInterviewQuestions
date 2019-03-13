package interviewQuestions;

import java.util.Arrays;

public class SmallestandLargestNumberArray {

	public static void main(String[] args) {

	//int numbers[] = {-10, 24, -50, -88, 987656, 987657,0};	//During interview it's best to provide different TC
	//int numbers[] = {-100, -24, -50, -88, -987656, -987657,0};	
	//int numbers[] = {10,20};
	//int numbers[] = {10,10}; 
	//int numbers[] = {0,0}; 
	int numbers[] = {0,-1}; 

                             //Time complexity will be = O(n) = vocalized as O of n because we have only 1 for loop 

	
	int largest = numbers[0];    //Step 1: Initialized w/ 2 variables largest & smallest 1st #
	int smallest = numbers[0];
	
	for(int i = 1; i<numbers.length; i++) {  //Step 2: Then compare, if greater then store in largest # if it is smaller than store in smaller#
		if(numbers[i]>largest) {
			largest = numbers[i];  //1st 24, 2nd 50, finally largest is 987656   |   Vocalized [i] as numbers of i
		}
		else if(numbers[i]<smallest) {
			smallest = numbers[i]; //-88
		}
	}
	                  //\n Pushes down like hitting enter & indent 
	System.out.println("\n Given array is: " + Arrays.toString(numbers));
	System.out.println("Largest number is:: " + largest);
	System.out.println("Smallest number is:: " + smallest);
	
	
	
	
	
		
		
	}

}
