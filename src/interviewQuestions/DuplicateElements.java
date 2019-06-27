package interviewQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {           //****IQ: Which string is duplicate?  Using O N Square Time Complexity

	public static void main(String[] args) {

		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "C", "Java"};
		
		//1. Compare each element: Time complexity is O(nxn) ---- Worst solution cuz if we have millions of elements or records then it will take more time
		for(int i = 0; i<names.length; i++) {     //to compare between each and every elements
			for(int j = i+1; j<names.length; j++) { //For comparing start 2nd loop
				
				//Compare w/ IF CONDITION before printing the duplicate   
				if(names[i].equals(names[j])) {  //For String comparison we use .equals() to look for identical names of I & names of J
					System.out.println("The duplicate element is:: " + names[i]);
				}  //When using inner and outer loop then the time complexity is O(nxn) to O multiply by N, to vocalize it (O N Square) 
			}
		}
		
		
		System.out.println("**********************");
		
		
		//2. Using HashSet, which is part of Java Collection: so HashSet can ONLY store UNIQUE values: The time complexity of HashSet = is O(n) cuz we are using only 1 for loop (more efficient)
		
		//Start w/ creating a Set Object
		
		Set<String> store = new HashSet<String>(); // = new HashSet<String>(); is a child class object which can be referred by parent Interface reference variable (of SET the parent) which is (stored) on the other side of =  |  
		
		for(String value : names){ //Iterating this by using for loop, "VALUE" is given for simple variable name for the string.. nameS (with s) is an array from line 13 | Since HashSet is a class.. it is implementing SET Interface                                    
		//Give a variable String name that will represent each element inside the array (values) : NAMES is the entire array from line 13
			
			if(store.add(value) == false){ //SET Object CANNOT store duplicate values (as soon as it is duplicate, it is FALSE. Since Java is already stored than it's false when iteration tries to store it  
			//.add() is boolean so true or false, if it UNIQUE then it will be added, if false then we know which one is the Duplicate
			
				System.out.println("The duplicate element is:: " + value); //If condition picks out the false value (duplicate = Java) then give it to me & print it

			}
		}
		
		
		System.out.println("*****************");
		
		
		
		//USING HASHMAP IS NOT NECESSARY TO ANSWER THE QUESTION
		//3. Using HashMap: O(2n) vocalized as O f 2n but take time to review it | In HashMap duplicate elements are allowed
//		Map<String, Integer> storeMap = new HashMap<String, Integer>();  //This answer is icing of the cake but not needed
//		//Key is in String, Value is in Integer (integer means how many time something repeats)
//		
//		         //Iterator the names[] from line 13
//		for(String name : names) {
//			//name points to Java from top, but Java is not available in repeats so it will return null 
//			Integer count = storeMap.get(name); //count value will be null first time cuz there is storeMap from line 45 is a blank object
//		//Store in wrapper class object (Integer count) = 
//			
//			if(count == null) {
//				storeMap.put(name, 1); //1 here is how many time it is coming
//			} //put in HashMap is how we add
//		}
//		
//		//Now get the values from the above HashMap: 
//		
//		Set<Entry<String, Integer>> entrySet = storeMap.entrySet();  //CAN'T MAKE IT WORK HERE
//		for(Entry<String, Integer> entry : entrySet) {
//			if(entry.getVaue()>1) {
//				System.out.println("Duplicate element is: " + entry.getkey);
//			}
//		}
		
	 
	}	

}
