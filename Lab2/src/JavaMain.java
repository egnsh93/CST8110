import java.util.Scanner; // program uses class Scanner

/**
 * This program prompts user to enter 10 numbers, then displays largest and
 * average of the numbers. Author: Linda Crane CST8110 Introduction to Computer
 * Programming
 */

public class JavaMain
{

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);

        int counter = 0;
        int number = 0;

        System.out.print("\nEnter number:");
        number = input.nextInt();

        input.close();

        System.out.println("\nThe first three numbers after " + number + " are:");

        while (counter < 3)
        {
            number++;
            counter++;
            System.out.println(number);
        }

    } // end of main
}// end of class
