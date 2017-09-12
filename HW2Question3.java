import java.util.Scanner;

/******************************************************
 * File: 			HW2Question3.java
 * 
 * Author:			Steven Imas
 * 
 * Description:		Write a program to check 
 * 					whether a string is a palindrome 
 * 					(a string that's the same forward and 
 * 					backwards, for eg, madamimadam) 
 * 
 * Date:			9/11/2017
 * 
 * Source:			http://componentsprogramming.com/palindromes/
 *****************************************************/


public class HW2Question3{
	public static boolean isPalindrome(char[] word){
    int i1 = 0;
    int i2 = word.length - 1;
    // for example if input is madamimadam,
    // i1 will be 0 and i2 will be 12.
    
    

    while (i2 > i1) {
        if (word[i1] != word[i2]) {
            return false;
        }
        ++i1;
        --i2;
    }
    return true;
} // end boolean
/****************************************
 	Following the above example, 
	First loop iteration will compare word[0]
    and word[11]. They're equal,
	so we increment i1 (it's now 1) and decrement
	i2 (it's now 10).
	So we then compare the characters. 
	They're equal, so we increment i1 
	(it's now 2) and decrement i2 (it's now 9)
	Then, we again compare whether the two 
	characters match. This repeats until the 
	condition for the while loop is no longer 
	true so the loop terminates and we return true.
********************************************/
	
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("\n\nPlease enter a word: ");

		String entry = scanner.nextLine(); // gets user input String.
		char[] charToString = entry.toCharArray();//converts user input String into an array of characters

		
		
			
		
			if(isPalindrome(charToString) == true) {
				System.out.println(entry + " is a palindrome!");
				
			} 		// end if  
			else {
				System.out.println(entry + " is not a palindrome!");
				
			} 		// end else
			

	} 				// end main
	
}					// end class

/**************************************************************************************
 			SAMPLE OUTPUT
 			
 			TEST 1
 			
 			Please enter a word: 
			racecar
			racecar is a palindrome!
			
			TEST 2

			Please enter a word: 
			java
			java is not a palindrome!
**************************************************************************************/
