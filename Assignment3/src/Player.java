import java.util.Scanner;

public class Player
{

    private int pot;
    private int betValue;
    private String betString;

    public Player()
    {
        pot = 100;
        betValue = 0;
        betString = null;
    }

    public void setPot()
    {

        boolean error;
        error = false;

        do
        {

            try
            {

                // Instantiate the scanner within the try to avoid an infinite
                // loop
                Scanner input = new Scanner(System.in);

                error = false;

                // Set the user's initial pot
                System.out.print("\nHow much do you want to bet? $");
                betValue = input.nextInt();

                // If player bet is less than or equal to zero, or greater than
                // the pot, error.
                if (betValue <= 0)
                {
                    System.err.println("\nExcuse me, sir, your bet must be greater than zero");
                    error = true;
                }
                else if (betValue > getPot())
                {
                    System.err.println("\nNice try, you are trying to bet more than you have\n");
                    error = true;
                }

            }
            catch (Exception e)
            {

                // Display error message
                System.out.println("\nPlease enter a valid number");
                error = true;

            }

        }
        while (error == true); // Again, again!

    }

    public void setBet()
    {

        boolean error;
        error = false;

        do
        {

            try
            {

                // Instantiate the scanner within the try to avoid an infinite
                // loop
                Scanner input = new Scanner(System.in);

                error = false;

                // Set the user's bet
                System.out.print("What is your bet? (odd/even/red/black/exact number: 0 to 39) ");
                betString = input.next();

                // Parse the player bet to an integer to check for valid range
                int betNum = Integer.parseInt(betString);

                // Check range
                if (betNum < 0 || betNum > 39)
                {
                    System.err.print("\nNumber out of range (0-39)\n");
                    error = true;
                }

            }
            catch (NumberFormatException e)
            {

                // If player bet string does not contain a valid bet
                if (betString.equalsIgnoreCase("red") == false && betString.equalsIgnoreCase("black") == false && betString.equalsIgnoreCase("odd") == false
                        && betString.equalsIgnoreCase("even") == false)
                {

                    System.err.print("\nYou must enter either: red, black, odd, even, or a number between 0 and 39\n");
                    error = true;
                }

            }

        }
        while (error == true); // Again, again!

    }

    public int getPot()
    {
        return this.pot;
    }

    public int getBetValue()
    {
        return this.betValue;
    }

    public String getBetString()
    {
        return this.betString;
    }

    public void updatePot(int amount)
    {
        pot = pot + (getBetValue() * amount); // Adds the winning amount to the
                                              // pot
    }

}