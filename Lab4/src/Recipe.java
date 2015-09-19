// **********************************************************
// Lab: #4 - Intro to Classes
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Class based program that produces a very
// basic recipe for gingerbread cookies.

// *********************************************************

import java.text.DecimalFormat;
import java.util.Scanner;

public class Recipe
{

    private double butter, brownSugar, molasses, egg;
    private double flour, bakingSoda, cinnamon, ginger;

    public Recipe()
    {

        butter = 1;
        brownSugar = 1;
        molasses = 1;
        egg = 2;
        flour = 1.0 / 3;
        bakingSoda = 0.25;
        cinnamon = 0.25;
        ginger = 1;

    }

    public int getNumberOfCookies()
    {

        // Ask the user how many cookies they want to make and store the result
        Scanner input = new Scanner(System.in);
        System.out.print("How many cookies do you want to make: ");
        // Define and initialize the number of cookies and ingredients
        int numberOfCookies = input.nextInt();

        input.close();

        return numberOfCookies;

    }

    public void calculateAmounts(int numberOfCookies)
    {

        // Calculate the required ingredients based on the number of cookies
        butter *= numberOfCookies;
        brownSugar *= numberOfCookies;
        molasses *= numberOfCookies;

        egg *= numberOfCookies;
        ginger *= numberOfCookies;

        flour *= numberOfCookies;
        bakingSoda *= numberOfCookies;
        cinnamon *= numberOfCookies;

    }

    public void displayRecipe()
    {

        // Subclass of NumberFormat responsible for formatting decimals
        DecimalFormat form = new DecimalFormat();

        form.applyPattern("#0.0"); // unlimited before decimal, 1 after decimal

        // Print out and formats the recipe using the calculated ingredient
        // totals
        System.out.println("  1) Mix " + butter + " Tablespoons butter with " + brownSugar + " Tablespoons brown sugar");
        System.out.println("  2) Add " + molasses + " Tablespoons molasses and " + egg + " Teaspoons eggs and mix well");
        System.out.println("  3) Add " + form.format(flour) + " cups flour and " + form.format(bakingSoda) + " teaspoons baking soda (don't mix yet!)");
        System.out.println("  4) Add " + form.format(cinnamon) + " teaspoons baking cinnamon and " + ginger + " pinches of ginger and mix well");
        System.out.println("  5) Put a little flour on the table and flatten out your dough. Cut out your Gingerbread men with a cookie cutter.");
        System.out.println("  6) Place your Gingerbread men on an ungreased cookie sheet. Bake at 350 degrees for 8-10 minutes");

    }

}