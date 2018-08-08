/**
 * Assignment - question seven. Average calculator
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.util.*;   
public class assignmentSeven
{
    public static void main(String arg[])
    {
        // defining boolean variable, what happens when loop starts
        boolean Restart = true;
        // loop will perform the below functions 
        do  { 
            // initialising general scanner  
            Scanner input=new Scanner(System.in);
            // input prompt for entering number for calculating average
            System.out.println("Enter a series of numbers to find their average");
            // input prompt stating to calculate enter 0 twice
            System.out.println("Enter 0 twice to calculate");
            // while loop initiated as evaluating boolean expression
            // Reads the users input and repeats if users enters a string value
            while (!input.hasNextInt()) 
            {
                System.out.println("Only integers can be entered.");
                input.next();
            }
            // defining variable for number and total
            int number, total = 0;
            // defining scanner variable for numbers collects    
            number = input.nextInt();
            // defining to value for the variable total
            total += number;
            // defining the variable for the number of entries 
            int numOfEntries = 0;
            if (number < 0)
            { 
                // if number entered is below 0 it is not counted towards number of entry
                // if number entered is below 0 it is not counted towards total
                numOfEntries -= 1;
                total -= number;
                // while loop initiated as evaluating boolean expression
                // Reads the users input and repeats if users enters a string value

            }
            while (number != 0) 
            {
                // while loop initiated as evaluating boolean expression
                // Reads the users input and repeats if users enters a string value
                while (!input.hasNextInt()) 
                {
                    System.out.println("Only integers can be entered.");
                    input.next();
                }   
                // defining scanner variable for numbers collects    
                number = input.nextInt();
                // stating on every loop instance that the number of entry will increment by 1
                numOfEntries++;
                // defining to value for the variable total
                total += number;
                // initialising logic if the total reaches a certain condition 
                if (number < 0)
                { 
                    // if number entered is below 0 it is not counted towards number of entry
                    // if number entered is below 0 it is not counted towards total
                    numOfEntries -= 1;
                    total -= number;
                }
            }
            //  Output the total plus the number of entries the user entered  
            System.out.println("The total is " + total + "." + "  You entered  " + numOfEntries + " numbers " );
            //  Define average as the total divided by number of entries
            //  Error handling for Arithmetic Exception in case user only enters negative numbers
            try 
            {
                int avg = total/numOfEntries;
                System.out.println("The average is " + avg);
            }
            catch (ArithmeticException aex)     
            {
                System.out.println("Arithmetic Exception. You should repeat " );

            }  
            // print average of numbers collected

            // Statement requesting if the user wants to restart the program
            System.out.println("Do you want to calculate more numbers? (Y or N)");
            // defining scanner varible for restart query reponse      
            String tryAgain = input.nextLine();
            // logic parameter stating if users reponse starts with n or N to quit program.  
            // Any other letter will restart the program
            if(input.nextLine().startsWith("n")||input.nextLine().startsWith("N")) 
                Restart = false;     
        }
        //loop to restart the program    
        while (Restart);        
    }
}
