/**
 * Assignment - question eight. Leap Year Calculator
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LeapYearApplication extends JFrame  {
    // declaring the variable/pointer for the panel
    JPanel mainPanel; 
    // declaring the variable/pointer for buttton to calculate
    JButton calculateButton;
    // declaring the variable/pointer for the label
    JLabel firstLabel;
    // declaring the variable for the text box
    JTextField TextBox;
    public LeapYearApplication () //constructor 
    {
        LeapYearDecesion();
    }

    public void LeapYearDecesion() //method 
    {
        // title for Jframe
        setTitle ("Leap Year");
        // setting container so it is visable
        setVisible(true);
        // setting the size of the container
        setSize(500, 250);
        // make sure the programs closes if container closes 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set container so the user is unable to resize it
        setResizable(false);
        setLocationRelativeTo(null);
        // Create new panel
        mainPanel = new JPanel(); 
        // setting layout for panel 
        mainPanel.setLayout(null);
        // setting background colour for panel
        mainPanel.setBackground(new Color(142, 164, 237));
        // creating new button and naming it
        calculateButton = new JButton("Calculate");
        // setting the position for the new button 
        calculateButton.setBounds(205, 100,90, 35);
        // creating new label and setting what it will say
        firstLabel = new JLabel("Press the button to see if its a leap year.");
        // setting the position for the new label
        firstLabel.setBounds(45, 40,450, 30);
        // creating new text field
        TextBox = new JTextField(5);
        // setting the position for the new text field 
        TextBox.setBounds(195, 150,110, 35);
        // defining variable for a new font 
        Font mylabelFont = new Font("Serif", Font.BOLD, 15);
        // setting font size 
        Font newFont = mylabelFont.deriveFont(25F);
        // allocated font variable to label text 
        firstLabel.setFont(newFont);
        //the start of the action listener for the button to calculate  if it is a leap year
        calculateButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    // setting number as an integer
                    int number;
                    // statement to know notify the user has enter incorrect data type
                    try 
                    {
                        // parsing the text entered 
                        number = Integer.parseInt(
                            TextBox.getText());        
                    } 
                    catch (NumberFormatException calculateButton)     
                    {
                        // exception handling, if user inputs string display a message
                        JOptionPane.showMessageDialog(new JFrame(), "Not a valid year. ",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        return;

                    }                                         
                    // initialising logic if the number reaches a certain condition 
                    // if the user inputs a figure divisible  with 4 and is  not divisible by 100 it is a leap year 
                    // or if the number is divisalbe by 400 it is a leap year
                    if ((number % 4 == 0) && (number % 100 != 0) || (number % 400 == 0))
                    {
                        JOptionPane.showMessageDialog(new JFrame(), number + " is a leap year ",
                            "Leap year", JOptionPane.INFORMATION_MESSAGE);
                    }
                    // logic to state everything else to display a message stating it is not a leap year
                    else
                    {

                        JOptionPane.showMessageDialog(new JFrame(), number + " is not a leap year ",
                            "Leap year", JOptionPane.INFORMATION_MESSAGE);        }  

                }

            });
        // Connecting the button feature to the main panel. 
        mainPanel.add(calculateButton);
        // Connecting the text box feature to the main panel. 
        mainPanel.add(TextBox);
        // Connecting the first label feature to the main panel. 
        mainPanel.add(firstLabel);
        // Connecting the main panel feature to the container. 
        add(mainPanel);
    }
    // initiating the main method, of which runs the programs
    public static void main(String [] args){
        new LeapYearApplication();
    }
}