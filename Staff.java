import java.util.ArrayList;
/**
 * 
 * @author ryujiroyoshioka
 *
 */
public class Staff {
	
	ArrayList<String> list;
	
	/**
	 * The constructor takes an ArrayList 
	 * of String names as a parameter
	 * @param theList
	 */
	public Staff(ArrayList<String> theList) {
		
		list = theList; 
	}
	
	/**
	 * Determines if the other Staff contains 
	 * all the same elements in the same order 
	 * as this Staff
	 * @param other
	 * @return equals
	 */
	public boolean equals(Staff other) {
		
		boolean equals = true;
		
		for(int i = 0; i < list.size();i++) {
			
			if(this.list.size() != other.list.size()) {
				
				return false;
			}
			
			else if(!this.list.get(i).equals(other.list.get(i))) {
				
				return false;
			}
			
		}
		return equals;
	}
	
	/**
	 * Determines if the other Staff and 
	 * this Staff contain exactly 
	 * the same elements but in any order
	 * @param other
	 * @return same 
	 */
	public boolean sameContents(Staff other) {
		
		boolean same = true;
		
		//Checking if the two have the same number of elements
		if(this.list.size() != other.list.size()) {
			
			same = false;
		}
		
		else {
			
			same = true;
		}
		
		return same;
	}
	
	/**
	 * Replaces each vowel in every ArrayList 
	 * element with the replacement value text. 
	 * Assume the vowels are aeiouyAEIOUY
	 * @param text to replace
	 */
	public void replaceVowelsWith(String text) {
		
		// i = the index of the list - index list
		for(int i = 0; i < list.size();i++) {
			
			String current = list.get(i);
			
			// j = the index of the string - string index
			for(int j = 0; j < current.length();j++) {
				
				String character = current.substring(j,j+1);
				if("aiueoy".contains(character.toLowerCase())) {
					
					current = current.replace(character, text);
					list.set(i,current);
				}
				
			}
		}
		
	}
	
	/**
	 * Gets the staff member whose name has the most vowels. 
	 * If more than one has that number of vowels, return the first. 
	 * Return null if the list is empty.
	 * @return
	 */
	public String mostVowels() {
		
		String most = "";
		int mostVowels = 0;
		
		// Checking if the list is empty
		// return null
		if (list.size() == 0) {
			
			return null;
		}
		
		// Enhanced for loop
		for(String name : list) {
			
			int currentNumbeOfVowels = vowelsCount(name);{
				if(currentNumbeOfVowels > mostVowels) {
					
					mostVowels = currentNumbeOfVowels;
					most = name;
			
				}
			}
		}
		
		return most;
	}
	
	/**
	 *  We need to create this method to 
	 *  count the number of vowels
	 * @param c
	 * @return how many vowels in c. 
	 */
	public int vowelsCount(String c) {
		
		int count = 0;
		String vowels = "aeiouAEIOU";
		
		for(int i = 0; i < c.length(); i++) {
			
			if(vowels.contains(c.substring(i,i+1))){
				count++;
			}
		}
		return count;
	}
	
	/**
	 * gets a string represent ion 
	 * using ArrayList's toString method
	 */
	public String toString() {
		
		return list.toString();
		
	}
}
