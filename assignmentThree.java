/**
 * Assignment - question three. Payslip calculator 
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.util.*;
import java.text.DecimalFormat;
public class assignmentThree {
    // Creating decimal variable to convert large double figures.
    private static DecimalFormat df2 = new DecimalFormat(".##");
    public static void main(){
        // defining boolean variable, what happens when loop starts
        boolean Restart = true;
        // loop will perform the below functions 
        do  {
            // initialising general scanner  
            Scanner input = new Scanner(System.in);
            // input prompt for entering the employees title      
            System.out.println("Please enter the employees title :\n e.g. Mr, Mrs. : ");
            // defining scanner variable for title      
            String title = input.nextLine();
            // input prompt for the employees first name    
            System.out.println("Please enter the employees forenames : ");
            // defining scanner variable for first name     
            String forenames =  input.nextLine();
            // input prompt for the employees surname
            System.out.println("Please enter the employees surname : ");
            // defining scanner variable for employee 
            String surname = input.nextLine();
            // input prompt to enter the employees amount of hours worked   
            System.out.println("Please enter the amount of hours worked: ");
            // while loop initiated as evaluating boolean expression condition
            // Reads the users input and repeats if users enters a value which is a string
            while (!input.hasNextDouble()) 
            {
                System.out.println("Only numbers can be entered.");
                System.out.println("Please enter the amount of hours worked: ");
                input.next();
            }
            // defining scanner variable for hours
            // defined as a double to insure user can enter decimals 
            double hoursWorked = input.nextInt();
            // while loop initiated as evaluating boolean expression condition
            // reads the of the previous user input, which is now stored in 'hours'
            // conditional logic if this value is above 48 to continue loop 
            while (hoursWorked > 48 || hoursWorked <= 0 ) 
            {
                System.out.print("Hours not valid!!  Please enter a legal amount ");
                hoursWorked = input.nextDouble();

            }
            // defining variable for the general rate by hour for the company
            double hourRate = 15;
            // defining variable for the overtime hours 
            // defining variable for the standard hours
            // defined as a double to insure variables can hold decimal values  
            // have to be initially defined as 0 so the below conditional logic can work
            double OvertimeHours = 0, standardHours = 0;
            // defining variable for the double rate per hour parameter 
            // defining variable for the triple rate per hour parameter 
            // defining variable for overtime hour calculation 
            // defining variable for standard Rate total calculation  
            // have to be initially defined as 0 so the below conditional logic can work
            // defined as a double to insure variables can hold decimal values  
            double doubleRate = 1.5, tripleRate = 2, overTimePay = 0, standardRateTotal = 0;
            // initialising logic if the total reaches a certain condition
            // calculating the submitted overtime hours  
            // if the value is between 37 and 41 the hour rate is multiplied by the double rate parameter
            // the submitted hours are subtracted by 36 
            // the sum is then multiplied by the left over over time hours
            // if the submitted over are over 41 the same process applies 
            // double rate parameter is just replaced by the triple rate parameter
            // if the user input reachs any of these conditions overtime pay is set to 0 
            if (hoursWorked >= 37 && hoursWorked <= 41)
            {
                overTimePay=( (hourRate*doubleRate) * (hoursWorked - 36));
            }
            else if (hoursWorked >= 42)
            {
                overTimePay=( (hourRate*tripleRate) * (hoursWorked - 36));
            }
            else 
            {
                overTimePay = 0;
            }
            // initialising logic if the total reaches a certain condition
            // logic to state if the submitted hours are over 36
            // to only calculate the rate for the standard rate pay 
            // multiplying 36 by 15 
            // if the submitted hours are below this value
            // multiply the submitted hours by the normal hourly rate
            if (hoursWorked >= 37)
            {
                standardRateTotal = 36 * hourRate;
            }
            else  
            {
                standardRateTotal = hoursWorked *hourRate;
            }
            // defining variable for the overall total by adding the standard rate time by overtime 
            // defining variable for national insurance calculation 
            // defining variable for the tax calculation  
            // have to be initially defined as 0 so the below conditional logic can work
            // defined as a double to insure variables can hold decimal values  
            double beforeTaxTotal = standardRateTotal + overTimePay;
            double nationalInsuranceRate = 0;
            double taxRate = 0;
            // initialising logic if the total reaches a certain condition
            // logic to state decide what the tax and national insurance rates will be 
            // depending on the amount the overall total adds up to defines how high the rate will be 
            if (beforeTaxTotal <= 600)
            {
                taxRate = 0;
                nationalInsuranceRate = 2;
            }
            else if (beforeTaxTotal >= 601 && beforeTaxTotal <= 700)
            {
                taxRate = 5;
                nationalInsuranceRate = 4;
            }
            else if (beforeTaxTotal >= 701 && beforeTaxTotal <= 849)
            {
                taxRate = 7;
                nationalInsuranceRate = 6;
            }
            else if (beforeTaxTotal >= 850)
            {
                taxRate = 14;
                nationalInsuranceRate = 8;
            }
            // defining the value for tax by taking the tax rate defined previously as a percentage 
            // dividing this by 100 and multiplying the sum by the before tax total
            double tax = ((taxRate/100)*beforeTaxTotal);
            // defining the value for national insurance 
            // by taking the national insurance rate defined previously as a percentage 
            // dividing this by 100 and multiplying the sum by the before tax total
            double nationalInsurance = ((nationalInsuranceRate/100)*beforeTaxTotal);
            // defining the value for the net total
            // taking the before tax total and subtracting the tax and national insurance values
            double netTotal = beforeTaxTotal - tax - nationalInsurance;
            // prompt to print 50 asterisks to add a realistic pay slip and readability
            System.out.println(new String(new char[50]).replace('\0', '*'));
            // printing the employees title, surname and the total for their standard rate of pay
            // applying decimal conversion to a place of two for national insurance
            System.out.println(title +" " + forenames + " " + surname + "'s standard rate = " + df2.format(standardRateTotal));
            // printing the total for the employees overtime rate of pay
            // applying decimal conversion to a place of two for national insurance
            System.out.println("Overtime rate = " + df2.format(overTimePay) );
            // initialising logic if the total reaches a certain condition
            // logic to state if the submitted hours are below 37 
            // the value is printed as the amount of standard rate hours 
            // and the overtime hours are set at -
            // logic to state if the submitted hours are over 36 
            // 36 will be stored in the variable 'standardHours' 
            // 'OvertimeHours' will be represented by the hours submitted minus 36 
            // both of these will be printed to the user
            if (hoursWorked <= 36)
            {
                OvertimeHours = 0;    

                System.out.println("Total standard hours = " + hoursWorked);
                System.out.println("Total overtime hours = " + OvertimeHours);
            }
            else if (hoursWorked >= 37)
            {
                standardHours = 36;
                OvertimeHours = hoursWorked - 36;
                System.out.println("Total standard hours = " + standardHours);
                System.out.println("Total overtime hours = " + OvertimeHours);
            }
            // prompt to print 50 asterisks to add a realistic pay slip and readability
            System.out.println(new String(new char[50]).replace('\0', '*'));
            // printing the total amount of tax and national insurance the employee has paid
            // applying decimal conversion to a place of two for national insurance
            System.out.println("Tax = " + tax + "\nNI = £" + df2.format(nationalInsurance));
            // printing the total net pay for the employee 
            System.out.println("Total =  £" + df2.format(netTotal));
            // prompt to print 50 asterisks to add a realistic pay slip and readability
            System.out.println(new String(new char[50]).replace('\0', '*'));
            // Statement requesting if the user wants to restart the program
            System.out.println("Do you want to enter another employee? \n(Y or N)");
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
