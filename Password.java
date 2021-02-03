import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Author: Jean Aime K Lukuka 

Program: Password.java 

Description: The Password.java application helps users set up 
	     strong password. 

Date created: 1/29/2020 
*/

public class Password {

    public static void main(String[] args) {

        // prompts for the password
        String password = JOptionPane.showInputDialog(null, "Enter a password");

        //Checks if the password contains at least one digit
       boolean digitCheck = password.contains("1") | password.contains("2") | password.contains("3") | password.contains("4")
               | password.contains("5") | password.contains("6") | password.contains("7") | password.contains("8") | password.contains("9")
               | password.contains("0");

            //Prompts the user to enter the password because he did not meet the requirements
            while (!digitCheck | (password.length()>10 | password.length() < 6)){
                password = JOptionPane.showInputDialog(null, "Password must be less than 10 characters\n" +
                                                                                   "More than 6 characters and contain at least\n" +

                                                                                   "a digit.");
                //Exits out of the loop when the user enters a password that follows the requirement
                if (digitCheck | (password.length()<10 | password.length() > 6)){
                    break;
                }
        }

            //Gets the password hint
            String passwordHint = password.substring(0, 3);

            //Prompts the user to enter the password for the second time
            String secondPassword = JOptionPane.showInputDialog(null, "Re-Enter the password again");
            //Prompts the user again in case the first password is not the same as the second password.
            while (!password.equals(secondPassword)){
                secondPassword = JOptionPane.showInputDialog(null, "Passwords don't match\n" +
                                                                                         "First Password Hint: "+passwordHint+"\n" +
                                                                                         "Re-Enter the password again");
            }

            //Displays the final message telling the user that he has successfully set up his password.
            JOptionPane.showMessageDialog(null, "You have successfully set up your password!");




    }

}
