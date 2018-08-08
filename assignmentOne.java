/**
 * Assignment - question one. commission calculator
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 * 
 * Description - Commission calculator based on amount.
 */
import java.util.*;
public class Assignment {
    public static void main(){   
        //defining boolean variable, what happens when loop starts
        boolean Restart = true;
        //loop will perform the below functions 
        do  {
            // defining variable for sales counter
            int salesCounter = 0;
            //initialising general scanner  
            Scanner input = new Scanner(System.in);
            //input prompt for entering the employees title
            System.out.println("Please enter the employees title :\n e.g. Mr, Mrs. : ");
            //defining scanner variable for title
            String title = input.nextLine();
            //input prompt for the employees surname
            System.out.println("Please enter the employees surname : ");
            //defining scanner variable for title
            String surname = input.nextLine();
            //defining the amount of individual sale and total    
            int salesAmount, total = 0;
            //prompt for user to enter the first sale and how to exit process
            System.out.println("Enter a the total of the first sale");
            //prompt for user on how to exit process
            System.out.println("****Once completed please enter 0 *****\n");
            //while loop initiated as evaluating boolean expression
            //Reads the users input and repeats if users enters a string value
            while (!input.hasNextInt()) 
            {
                System.out.println("Only numbers can be entered.\nPlease enter a number");
                input.next();
            }
            // defining scanner variable for sale amounts
            salesAmount = input.nextInt();
            // defining the total variable by adding the sale amount to the total
            total += salesAmount;
            // loop to keep adding sales amount to the total until condition is met
            // loop continues if user enters anything but a number
            // a variable to count the amount of sales being entered into the loop
            while (salesAmount != 0 ) 
            {
                System.out.print("Enter another sale\n  ");
                salesAmount = input.nextInt();
                total += salesAmount;
                salesCounter++;
            }
            // statement outputting the total of combined sales
            System.out.println(title + " " + surname + " has made " + salesCounter + " sales this week  ");
            // statement outputting the total of combined sales
            System.out.println("Totaling the amount of: " +total);
            // defining variable commission rate one as a percentage
            // initialising logic if the total reaches a certain condition
            // multipling the total variable by the percentage parameter given and dividing the figure by 100  
            if (total <= 19999 )
            {
                System.out.println("The commission rate is 0%");
                System.out.println((total*0/100) + " is the total commission for " + title  + " " +  surname);
            }
            else if (total >= 20000 && total <= 30999) 
            {
                System.out.println("The commission rate is 5%");
                System.out.println((total*5/100) + " is the total commission for " + title  + " " +  surname);
            }
            else if (total >= 31000 && total <= 45999)
            {
                System.out.println("The commission rate is 10%");
                System.out.println((total*10/100) + " is the total commission for " + title  + " " +  surname);
            }
            else if (total >= 46000 && total <= 59999) 
            {
                System.out.println("The commission rate is 12%");
                System.out.println((total*12/100) + " is the total commission for " + title  + " " +  surname);
            }
            else if (total >= 60000) 
            {
                System.out.println("The commission rate is 15%");
                System.out.println((total*15/100) + " is the total commission for " + title + " " + surname);
            }
            // Statement requesting if the user wants to restart the program
            System.out.println("Type no to exit program, to loop type anything . (Y or N)");
            // defining scanner variable for restart query response      
            String tryAgain = input.nextLine();
            // logic parameter stating if users response starts with n or N to quit program.  
            // Any other letter will restart the program
            if(input.nextLine().startsWith("n")|| input.nextLine().startsWith("N")) 
                Restart = false;     
        }
        //loop to restart the program
        while (Restart);
    }
}