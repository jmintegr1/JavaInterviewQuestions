package interviewQuestions;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {           //****IQ: Which string is duplicate?

	public static void main(String[] args) {

		String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java"};
		
		//1. Compare each element: Time complexity is O(nxn) ---- Worst solution
		for(int i = 0; i<names.length; i++) {
			for(int j = i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {  //String comparison use .equals
					System.out.println("duplicate element is:: " + names[i]);
				}  //When we are using inner loop and outer then the time complexity is O(nxn) to vocalize it (O n square)
			}
		}
		
		System.out.println("**********************");
		
		
		//2. Using HashSet: part of Java Collection: it can store unique values: The time complexity of this HashSet is O(n) cuz we are using only 1 for loop (much more efficient)
		Set<String> store = new HashSet<String>(); //HashSet child class object can be referred by parent Interface reference variable (store) 
		for(String name : names){ //Iterating this by using for loop, name is simple variable of  string.. names (w/ s) is array above  | Since HashSet is class.. it is implementing Set interface                                    
			if(store.add(name) == false){ //Set object cannot store duplicate values (as soon as it is duplicate, it is false) 
			//if(store.)
			System.out.println("duplicate element is:: " + name); //Iteration picks out the false value (duplicate = Java) then use that to print

			}
		
		}
		
		System.out.println("*****************");
		
		//3. Using HashMap: o(2n) vocalized as O f 2n but take time to review it
		Map<String, Integer> storeMap = new HashMap<String, Integer>();  //This answer is icing of the cake but not needed
		
		for(String name : names) {
			Integer count = storeMap.get(name);
			if(count == null) {
				storeMap.put(name, 1);
			}
		}
		
		//Now get the values from the above HashMap: 
		
		//Set<Entry<String, Integer>> entrySet = storeMap.entrySet();  Stopped around 23 min of How to find Duplicates Elements video
		
	 
	}	

}
