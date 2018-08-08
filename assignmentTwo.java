/**
 * Assignment - question two. Commission calculator, defined by codes
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.util.*;

public class assignmentSecond 
{

    public static void main()
    {
        //defining boolean variable, what happens when loop starts
        boolean Restart = true;
        //loop will perform the below functions 
        do  {
            //initialising general scanner  
            Scanner input = new Scanner(System.in);
            // input prompt for entering the employees title and to enter values in lower case
            System.out.println("Please enter the employees title :\n e.g. Mr, Mrs. : ");
            // defining scanner variable for title
            String title = input.nextLine();
            // input prompt for the employees surname
            System.out.println("Please enter the employees surname : ");
            // defining scanner variable for surname
            String surname = input.nextLine();
            // input prompt for final letter of sale code
            System.out.println("Please enter the relevant sale code: ");
            // input prompt for example of first part of sale code
            System.out.println("abc-a, abc-b, abc-c, abc-d, abc-e ");
            // defining scanner variable for surname
            String salesCode = input.nextLine();
            // while loop initiated as evaluating boolean expression
            // Reads the users input and repeats if users enters a string value
            System.out.println("Please enter the sale amount : ");
            while (!input.hasNextInt()) 
            {
                System.out.println("Only numbers can be entered.\nPlease enter a number");
                input.next();
            }
            // defining scanner variable for total     
            double salesAmount = input.nextInt();
            // while loop initiated as evaluating boolean expression
            // Reads sale inputs, making sure that all integers are positive 
            // Will loop until condition is met
            while (salesAmount <= 0)
            {
                System.out.println("Sale amounts can only be positive. ");
                System.out.println("Please enter the sale amount : ");
                salesAmount = input.nextInt();
            }
            // initialising logic if the total reaches a certain condition 
            // if user inputs certain parameter prints which commission rate is being utilised
            // divides the commission rate by 100
            // multiples the sales amount variable by the percentage parameter given and dividing the figure by 100  
            // this occours for each instance of the if but only with different percentage parameters
            // display the total commission value plus the employees name 
            if (salesCode.equals("abc-a")|| salesCode.equals("ABC-A"))
            {
                System.out.println("The commission rate is "+ 5 +"%");
                System.out.println((salesAmount*5/100) + " is the total commission of sale for " + title  + " " +  surname);
            }
            else if (salesCode.equals("abc-b")||salesCode.equals("ABC-B")) 
            {
                System.out.println("The commission rate is "+ 10 +"%");
                System.out.println((salesAmount*10/100) + " is the total commission of sale for " + title  + " " +  surname);
            }
            else if (salesCode.equals("abc-c")||salesCode.equals("ABC-C")) 
            {
                System.out.println("The commission rate is "+ 12 +"%");
                System.out.println((salesAmount*12/100) + " is the total commission of sale for " + title  + " " +  surname);
            }
            else if (salesCode.equals("abc-d")||salesCode.equals("ABC-D")) 
            {
                System.out.println("The commission rate is "+ 15 +"%");
                System.out.println((salesAmount*15/100) + " is the total commission of sale for " + title  + " " +  surname);
            } 
            else if (salesCode.equals("abc-e")||salesCode.equals("ABC-E")) 
            {
                System.out.println("The commission rate is "+ 17 +"%");
                System.out.println((salesAmount*17/100) + " is the total commission of sale for " + title + " " + surname);
            }
            // Statement requesting if the user wants to restart the program
            System.out.println("Do you want to enter another employee? (Y or N)");
            // defining scanner variable for restart query response      
            String tryAgain = input.nextLine();
            // logic parameter stating if users response starts with n or N to quit program.  
            // Any other letter will restart the program
            if(input.nextLine().startsWith("n")||input.nextLine().startsWith("N")) 
                Restart = false;     

        }
        //loop to restart the program    
        while (Restart);
    }
}