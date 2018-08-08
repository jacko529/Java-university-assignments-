/**
 * Assignment - question six. Loop integration      
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.util.*;
public class assignmentcSix{
    // defining static scanner, addtionally defining scanner variable
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
	// defining boolean variable, what happens when loop starts
        boolean Restart = true;
        // loop will perform the below functions 
        do  {
            // Statement requesting for the user to select a number from 1 to 6
            // Each of the numbers repersent what the program will display
            System.out.println("Please select from 1 - 6:  ");
            System.out.println("1: The squares of even integers in the range 2 to 20 "); 
            System.out.println("2: Alphabet in the lower case");
            System.out.println("3: Alphabet in the upper case");
            System.out.println("4: Alphabet displayed in both cases");
	    System.out.println("5: The sum of the squares of odd integers between 1 and 13");
	    System.out.println("6: The odd integers in the range 1 to 29"); 
	    // while loop initiated as evaluating boolean expression
            // Reads the users input and repeats if users enters a string value
	    while (!input.hasNextInt()) 
            {
                System.out.println("Only numbers can be entered.\nPlease enter a number");
                input.next();
            }
	    // defining scanner variable for the selector    
            int selector = input.nextInt();   
            // while loop initiated as evaluating boolean expression
            // Reads selector input, makes sure condition is not above 6
            // Reads selector input, makes sure condition is not below 1
            // Will loop until condition is met
	    while (selector>=7||selector<=0) 
            {
                System.out.println("Only numbers between 1 - 6 can be entered.\nPlease enter a number");
                selector = input.nextInt();  
            }
	    // initialising logic if the total reaches a certain condition  
            // If the selector equals 1 the program will initiate a list of square integers 
	    // all the below functions utilise the 'for' loop
            // taking a starting number of 1 looping until reaches 20 but has to in a dividable  by two.
	    if (selector==1)
            {
                for(int startingSquare=1; startingSquare<=20; startingSquare++)
                {
                    if (startingSquare%2==0 )
                    {
                        System.out.println(startingSquare*startingSquare);
                    }
                }
            }   
	    // initialising logic if the total reaches a certain condition  
            // If the selector equals 2 the program will initiate the alphabet all in lower case
	    else if (selector==2)
            {
                for (int alphabetLower=0; alphabetLower<26; alphabetLower++)
		{		
                    char lower = (char) ('a' + alphabetLower);
                    System.out.println(lower);
 		}
            }
	    // initialising logic if the total reaches a certain condition  
            // If the selector equals 3 the program will initiate the alphabet all in upper case
	    else if (selector==3)
            {
                for (int alphabetUpper=0; alphabetUpper<26; alphabetUpper++)
                {
                    char upper = (char) ('A' + alphabetUpper);
                    System.out.println(upper);
                }
            }
	    // initialising logic if the total reaches a certain condition  
            // If the selector equals 4 the program will initiate the alphabet in both upper and lower case
	    else if (selector==4)
            {
                for (int alphabetUpperLower=0; alphabetUpperLower<26; alphabetUpperLower++)
                {
                    char upper = (char) ('A' + alphabetUpperLower);
                    char lower = (char) ('a' + alphabetUpperLower);
                    System.out.println(lower);
                    System.out.println(upper);
                }
            }
 	    // initialising logic if the total reaches a certain condition  
            // If the selector equals 5 the program will initiate a sum of square numbers up to 13
            else if (selector==5)
            {
                int  sumOfSquaresTotal = 0 ;
                for(int sumOfSquares=1;  sumOfSquares<=13; sumOfSquares++) 
		{ 
                    if (sumOfSquares%2 !=0 )
                    {
                        sumOfSquaresTotal += sumOfSquares*sumOfSquares;
                    }
                }
                System.out.println(sumOfSquaresTotal);
	    }
            // initialising logic if the total reaches a certain condition  
            // If the selector equals 6 the program will initiate a list of odd integers up to 29
            // loop stops at 29 and increments in stages of 2
            else if (selector==6)
            {
                   for(int oddNumbers=1; oddNumbers<=29; oddNumbers+=2)
                   {
                    	System.out.println(oddNumbers);
                   }
	    }
            // Statement requesting if the user wants to restart the program
            System.out.println("Type no to exit program, to loop type anything . (Y or N)");
            // defining scanner variable for restart query response      
            String tryAgain = input.nextLine();
            // logic parameter stating if users response starts with n or N to quit program.  
            // Any other letter will restart the program
            if(input.nextLine().startsWith("n"))
                Restart = false;     
        }
         //loop to restart the program 
        while (Restart);
    }
}