// **********************************************************
// Assignment: #1 - Arithmetic/Problem Solving
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Produces a very basic recipe for
// gingerbread cookies.

// *********************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Assign1
{

    public static void main(String[] args)
    {

        // Program title
        System.out.println("Gingerbread men recipe generator");

        // Ask the user how many cookies they want to make and store the result
        System.out.print("  How many cookies do you want to make: ");
        Scanner input = new Scanner(System.in);

        input.close();

        // Define and initialize the number of cookies and ingredients
        int numCookies = input.nextInt();
        int butter = 1, brownSugar = 1, molasses = 1;
        int egg = 2;
        int ginger = 1;

        // Double is used to allow for decimals
        double flour = 0.3333;
        double bakingSoda = 0.25, cinnamon = 0.25;

        // Calculate the required ingredients based on the number of cookies
        butter *= numCookies;
        brownSugar *= numCookies;
        molasses *= numCookies;

        egg *= numCookies;
        ginger *= numCookies;

        flour *= numCookies;
        bakingSoda *= numCookies;
        cinnamon *= numCookies;

        // Subclass of NumberFormat responsible for formatting decimals
        DecimalFormat form = new DecimalFormat();
        form.applyPattern("#0.0"); // unlimited before decimal, 1 after decimal

        // Print out and formats the recipe using the calculated ingredient totals
        System.out.println("  1) Mix " + butter + " Tablespoons butter with " + brownSugar + " Tablespoons brown sugar");
        System.out.println("  2) Add " + molasses + " Tablespoons molasses and " + egg + " Teaspoons eggs and mix well");
        System.out.println("  3) Add " + form.format(flour) + " cups flour and " + form.format(bakingSoda) + " teaspoons baking soda (don't mix yet!)");
        System.out.println("  4) Add " + form.format(cinnamon) + " teaspoons baking cinnamon and " + ginger + " pinches of ginger and mix well");
        System.out.println("  5) Put a little flour on the table and flatten out your dough. Cut out your Gingerbread men with a cookie cutter.");
        System.out.println("  6) Place your Gingerbread men on an ungreased cookie sheet. Bake at 350 degrees for 8-10 minutes");

    }

}
