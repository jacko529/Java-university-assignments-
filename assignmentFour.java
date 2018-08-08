/**
 * Assignment - question four. Student grade calculator 
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.util.*;
public class assignmentFour
{
    public static void main(String[] args) {
        // defining boolean variable, what happens when loop starts
        boolean restart = true;
        // loop will perform the below functions 
        do {
            // initialising general scanner           
            Scanner input = new Scanner(System.in);
            // input prompt for entering the students coursework grade           
            System.out.println("Please enter the mark of the students coursework. ");
            // while loop initiated as evaluating boolean expression condition
            // Reads the users input and repeats if users enters a value which is a string
            while (!input.hasNextInt()) 
            {
                System.out.println("Only numbers can be entered.");
                System.out.println("Please enter the mark of the students coursework. ");
                input.next();
            }
            // defining scanner varible for hours 
            // the users input is stored into the varible PracticalcomponantGrade
            int PracticalcomponantGrade = input.nextInt();
            // while loop initiated as evaluating boolean expression condition
            // Reads the input stored in PracticalcomponantGrade 
            // contines the loop if the value is below 0 or over 50
            // only allowing a correct integer value 
            while ((PracticalcomponantGrade < 0) || (PracticalcomponantGrade >= 51))
            {
                System.out.println("Outside of marking grade. ");
                System.out.println("Please enter the mark of the students coursework. ");
                PracticalcomponantGrade = input.nextInt();
            }
            // input prompt for entering the students coursework grade                   
            System.out.println("Please enter the mark of the students exam. ");
            // while loop initiated as evaluating boolean expression condition
            // Reads the users input and repeats if users enters a value which is a string
            while (!input.hasNextInt()) 
            {
                System.out.println("Only numbers can be entered.");
                System.out.println("Please enter the mark of the students exam. ");
                input.next();
            }
            // defining scanner varible for hours 
            // the users input is stored into the varible PracticalcomponantGrade  
            int ExamcomponantGrade = input.nextInt();
            // while loop initiated as evaluating boolean expression condition
            // Reads the input stored in ExamcomponantGrade 
            // contines the loop if the value is below 0 or over 50
            // only allowing a correct integer value 
            while ((ExamcomponantGrade <= 0) || (ExamcomponantGrade >= 51))
            {
                System.out.println("Outside of marking grade. ");
                System.out.println("Please enter the grade of the students coursework. ");
                ExamcomponantGrade = input.nextInt();
            }
            // defining the variable FinalGrade
            // this varible is represented by adding both componants together
            int FinalGrade = PracticalcomponantGrade + ExamcomponantGrade;
            // defining the varible Moderated mark
            // this is a fixed mark if the student does not meet the requirments 
            // for a single componant. 
            int ModeratedMark = 39;
            // initialising logic if the total grade reaches a certain condition
            // logic to state if the sumbitted grades 39 and above added together 
            // but dont reach the required level for either the coursework or exam componant
            if ((FinalGrade >= 40 ) && (PracticalcomponantGrade <= 14))
            {
                FinalGrade = ModeratedMark;
                System.out.println("The student recieves a techical fail and mark has been moderated to 39 ");
            }
            else if ((FinalGrade >= 39 ) &&  (ExamcomponantGrade <= 14))
            { 
                FinalGrade = ModeratedMark;  
                System.out.println("The student recieves a techical fail and mark has been moderated to 39 ");
            }
            // statement to prompt the user to know the total mark
            // for the students coursework 
            System.out.println("The students coursework mark is " + PracticalcomponantGrade);
            // statement to prompt the user to know the total mark
            // for the exam 
            System.out.println("The students exam mark is " + ExamcomponantGrade);
            // statement to prompt the user to know the total mark final grade
            System.out.println("The students total mark is " + FinalGrade);
            // initialising logic if the total grade reaches a certain condition
            // logic to state if the sumbitted grades are between certain values 
            // it will print the students grade following the external parameters
            // this also includes if the students grade is 39 it will moderate
            // the grade to 40 reaching a c grade 
            // addtionally if it technical fail will print an F grade 
            if ((100 >= FinalGrade) && (70 <= FinalGrade)) 
            {
                System.out.println("The Student receives an A");
            }
            else if ((69 >= FinalGrade) && (60 <= FinalGrade)) 
            {
                System.out.println("The Student receives an B+");
            } 
            else if ((59 >= FinalGrade) && (50 <= FinalGrade)) 
            {
                System.out.println("The Student receives an B");
            } 
            else if ((49 >= FinalGrade) && (40 <= FinalGrade)) 
            {
                System.out.println("The Student receives an C");
            }
            else if ((FinalGrade == 39) && (PracticalcomponantGrade >= 15) && (ExamcomponantGrade >= 15)) 
            {
                System.out.println("The Students mark has been moderated to 40\nThe student receives a grade C");
            }
            else if ((38 >= FinalGrade) && (0 <= FinalGrade) || (FinalGrade == ModeratedMark)) {
                System.out.println("The Student receives an F");
            }
            // Statement requesting if the user wants to restart the program
            System.out.println("Do you want to mark another student? Y or N");
            // defining scanner varible for restart query reponse      
            String tryAgain = input.nextLine();
            // logic parameter stating if users reponse starts with n or N to quit program.
            // Any other letter will restart the program      
            if ((input.nextLine().startsWith("n")) || (input.nextLine().startsWith("N")))
            { 
                restart = false;
            }

        }  //loop to restart the program 
        while (restart);
    }
}