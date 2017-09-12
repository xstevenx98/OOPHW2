
/* File: 			HW2Question1Pyramid.java
 * 
 * Author:			Steven Imas
 * 
 * Description:		Write a program that asks the user how tall of a pyramid do they want to 
				    display on the screen, and then displays the pyramid that counts up on the 
				    left, and counts down on the right. For eg, if the user enters 4, the 
					program shows:
			
					        1
					      1 2 1
					    1 2 3 2 1
					  1 2 3 4 3 2 1
 * 
 * Date:			9/11/2017
 * 
 * Source:			http://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/
*/
import java.util.Scanner;

public class HW2Question1Pyramid {
	
	public static void main(String[] args) {
		/*** Local Variables ***/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Pyramid Height: ");
		int height = scanner.nextInt();
		int count = 1;
		
		while (true) {
			for(int a = height; a > 0; a--) {
		
			
			/** this loop prints a*2 spaces at the beginning of each row **/
			for (int b = 1; b <= a*2; b++) {
				System.out.print(" ");
			} 
			
			/** this loop prints b value where b will range from 1 to height **/
			for (int b = 1; b <= count; b++) {
				System.out.print(b + " ");
			}//end loop
			
			/** this loop prints b value where b starts at height-1 and ends at 1  **/
			for (int b = count - 1; b >= 1; b--) {
				System.out.print(b + " ");
			}//end loop
			System.out.println();
			//System.out.printf("%2.2f", count,height);
			
			/** Increments height count **/
			count++;
			
			
			}	// end for loop
			System.out.println("\nEnter Pyramid Height: ");
			height = scanner.nextInt();
			count = 1;
		}		// end while loop
	}			// end main
}				// end class

/*********************************************************************
			SAMPLE OUTPUT


Enter Pyramid Height: 
3
      1 
    1 2 1 
  1 2 3 2 1 

Enter Pyramid Height: 
4
        1 
      1 2 1 
    1 2 3 2 1 
  1 2 3 4 3 2 1 

Enter Pyramid Height: 
5
          1 
        1 2 1 
      1 2 3 2 1 
    1 2 3 4 3 2 1 
  1 2 3 4 5 4 3 2 1

*************************************************************************/