/**
 * Assignment - question five. Miles to kilometre conversion
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class assignmentFive{
    //defining decimal variable to attach to future variables needing to be limited
    private static DecimalFormat df2 = new DecimalFormat(".####");
    public static void main(String[] args){
        // defined as a double to allow decimals 
        // defining variable for increasing kilometre to the starting figure of 1.609
        double increasingKilometre = 1.609;
        // defining fixed conversion variable to add to the increasing kilometre
        double fixedConversion = 1.609;
        // defining variable for a mile stating at one.
        int mileFigure = 1;
        // defining the first instance of the word mile
        String exceptionString = " mile";
        // setting decimal variable to round float point up if needed 
        df2.setRoundingMode(RoundingMode.UP);
        // while loop initiated as evaluating boolean expression condition
        // loops mile figure until it reaches 20
        // on each loop adding the increasing kilometre  starting figure to the fixed conversion figure
        // if the mile figure reachs 2 the variable exceptionString switches to its plural  form
        while(mileFigure<=20)

        {
            System.out.println(mileFigure + exceptionString + " = " + df2.format(increasingKilometre) + " kilometres" );
            increasingKilometre+=fixedConversion;
            mileFigure++;

            if (mileFigure == 2) {
                exceptionString = " miles";  }

        }

    }
}