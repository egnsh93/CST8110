// **********************************************************
// Assignment: #2 - Using interacting classes
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Class based program that produces a very
// basic recipe for gingerbread cookies and
// converts measurement units.

// *********************************************************

public class Assign2
{

    public static void main(String[] args)
    {

        // Create a new object of the recipe class
        Recipe recipe = new Recipe();

        // Get the number of cookies
        double numberOfCookies = recipe.getNumberOfCookies();

        // Calculates the amount of ingredients in teaspoons
        recipe.calculateAmounts(numberOfCookies);

        // Display the calculated recipe
        recipe.displayRecipe();

    }

}