import java.util.Scanner;

public class Recipe
{

    private Ingredient butter;
    private Ingredient brownSugar;
    private Ingredient molasses;
    private Ingredient egg;
    private Ingredient flour;
    private Ingredient bakingSoda;
    private Ingredient cinnamon;
    private Ingredient ginger;

    public Recipe()
    {

        // Set all ingredients to 0.0 pinches by default
        butter = new Ingredient();
        brownSugar = new Ingredient();
        molasses = new Ingredient();
        egg = new Ingredient();
        flour = new Ingredient();
        bakingSoda = new Ingredient();
        cinnamon = new Ingredient();
        ginger = new Ingredient();

    }

    public double getNumberOfCookies()
    {

        boolean startOver = true;
        double numberOfCookies = 0;

        // Ask the user how many cookies they want to make and store the result
        Scanner input = new Scanner(System.in);
        System.out.print("How many cookies do you want to make: ");

        while (startOver)
        {

            // Get user input
            String userEntry = input.next();

            // Check for invalid entries (zero, negative, decimal) and restart the loop
            if (userEntry.contains(".") || userEntry.contains("-") || userEntry.contentEquals("0"))
            {
                System.out.println("Please enter a valid number: ");
                startOver = true;

            }
            else
            {

                try
                {

                    // Parse to a double to check for zero, if not valid restart loop
                    numberOfCookies = Double.parseDouble(userEntry);

                    if (numberOfCookies == 0)
                    {
                        System.out.println("Please enter a valid number: ");
                    }
                    else
                    {
                        startOver = false;
                    }

                }
                catch (NumberFormatException e)
                {
                    System.out.println("Please enter a valid number: ");
                }
            }
        }

        input.close();

        return numberOfCookies;

    }

    public void calculateAmounts(double numberOfCookies)
    {

        // Calculate the required ingredients based on the number of cookies
        butter = new Ingredient(numberOfCookies * 24.0, "pinches");
        brownSugar = new Ingredient(numberOfCookies * 24.0, "pinches");
        molasses = new Ingredient(numberOfCookies * 24.0, "pinches");
        egg = new Ingredient(numberOfCookies * 16.0, "pinches");
        flour = new Ingredient(numberOfCookies * 128.0, "pinches");
        bakingSoda = new Ingredient(numberOfCookies * 2.0, "pinches");
        cinnamon = new Ingredient(numberOfCookies * 2.0, "pinches");
        ginger = new Ingredient(numberOfCookies * 1.0, "pinches");

        // Using the value calculated above, determine the appropriate unit
        butter.convertUnit();
        brownSugar.convertUnit();
        molasses.convertUnit();
        egg.convertUnit();
        flour.convertUnit();
        bakingSoda.convertUnit();
        cinnamon.convertUnit();
        ginger.convertUnit();

    }

    public void displayRecipe()
    {

        // Print out and formats the recipe using the calculated ingredient totals
        System.out.println("  1) Mix " + butter.returnAmounts() + " butter with " + brownSugar.returnAmounts() + " brown sugar");
        System.out.println("  2) Add " + molasses.returnAmounts() + " molasses and " + egg.returnAmounts() + " eggs and mix well");
        System.out.println("  3) Add " + flour.returnAmounts() + " flour and " + bakingSoda.returnAmounts() + " baking soda (don't mix yet!)");
        System.out.println("  4) Add " + cinnamon.returnAmounts() + " cinnamon and " + ginger.returnAmounts() + " of ginger and mix well");
        System.out.println("  5) Put a little flour on the table and flatten out your dough. Cut out your Gingerbread men with a cookie cutter.");
        System.out.println("  6) Place your Gingerbread men on an ungreased cookie sheet. Bake at 350 degrees for 8-10 minutes");

    }

}