/**
 * Assignment - question nine. Blood Type App 
 *
 * @author (Jack Churchill)
 * @version (Version 1 - 05/02/18)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BloodTypeApp extends JFrame
{
    public BloodTypeApp()// constructor
    {
        BloodTypeDecesion();
    }

    public void BloodTypeDecesion()// method 
    {
        // setting title for the JFrame
        setTitle ("Blood Type Application");
        // setting container so it is visable
        setVisible(true);
        // setting the size of the container
        setBounds(10, 80, 440, 200);
        // make sure the programs closes if container closes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        // set container so the user is unable to resize it    
        setResizable(false);
        setLocationRelativeTo(null);
        // Create and define new panel and its variable
        JPanel mainPanel = new JPanel();
        // setting layout for panel 
        mainPanel.setLayout(null);
        // setting background colour for panel
        mainPanel.setBackground(new Color(142, 164, 237));
        // assigning font variable for first and second label
        Font mylabelFont = new Font("Serif", Font.BOLD, 12);
        // setting font size 
        Font newFont = mylabelFont.deriveFont(16F);
        // Create and define third label and its variable
        JLabel firstLabel = new JLabel("Select your blood type from the drop down."); 
        // setting the position for the first label 
        firstLabel.setBounds(30, 8,290, 50);
        // assigning font variable to third label text
        firstLabel.setFont(newFont);
        // Create and define third label and its variable
        JLabel secondLabel = new JLabel("The compatible blood will display below. "); 
        // setting the position for the second label 
        secondLabel.setBounds(30, 70,350, 20);
        // assigning font variable to second label text
        secondLabel.setFont(newFont);
        // Create and define third label and its variable
        JLabel thirdLabel = new JLabel();
        // setting the position for the third label 
        thirdLabel.setBounds(30, 100,500, 30);
        // assigning font variable for third label
        Font myfinalFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        // setting font size 
        Font newNowFont = myfinalFont.deriveFont(25F);
        // assigning font variable to third label text
        thirdLabel.setFont(newNowFont);
        // setting foreground colour for third label
        thirdLabel.setForeground(new Color(132, 10, 16));
        // creatig array for bloodtype choices 
        String[] comboBoxArrayForBloodTypes = { "", "O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+"};
        // creating combobox and inseting array variable
        JComboBox bloodTypeScroll = new JComboBox(comboBoxArrayForBloodTypes);
        // setting the position for the combobox
        bloodTypeScroll.setBounds(310, 62, 100, 35);
        //adding actionlistener for combobox 
        bloodTypeScroll.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e)
                {
                    // initialising logic if the combo box reaches a certain condition 
                    // if a certain attribute is selected from the combobox, the corresponding matched blood type is printed 
                    if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[0]))
                        thirdLabel.setText(" ");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[1]))
                        thirdLabel.setText("O- ");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[2]))
                        thirdLabel.setText("O-, O+");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[3]))
                        thirdLabel.setText("O-, A-");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[4]))
                        thirdLabel.setText("O-, O+, A-, A+ ");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[5]))
                        thirdLabel.setText("O-, B-");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[6]))
                        thirdLabel.setText("O-, O+, B-, B+");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[7]))
                        thirdLabel.setText("O-, A-, B-, AB-");
                    else if (bloodTypeScroll.getSelectedItem().toString().equals(comboBoxArrayForBloodTypes[8]))
                        thirdLabel.setText(" O-, O+, A-, A+, B-, B+, AB-, AB+");

                }
            });   
        // Connecting the first label feature to the main panel. 
        mainPanel.add(firstLabel);
        // Connecting the second label feature to the main panel. 
        mainPanel.add(secondLabel);
        // Connecting the combobox feature to the main panel. 
        mainPanel.add(bloodTypeScroll);
        // Connecting the third label feature to the main panel. 
        mainPanel.add(thirdLabel);
        // Connecting the main panel feature to the container. 
        add(mainPanel);

    }
    // initiating the main method, of which runs the programs
    public static void main(String [] args){
        new BloodTypeApp();
    }
}