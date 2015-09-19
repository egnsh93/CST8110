import java.util.Scanner;

public class Roulette
{

    private Player currentPlayer;
    private Wheel wheel;
    private boolean startOver;

    public Roulette()
    {
        currentPlayer = new Player();
        wheel = new Wheel();
        startOver = false;
    }

    public void newGame()
    {

        // Display the Welcome Menu
        displayMenu();

        // Set Pot
        currentPlayer.setPot();

        // Set Bet
        currentPlayer.setBet();

        // Spin
        wheel.spin();
        wheel.displaySpin();

        // Check Win/Lose
        checkResult();

    }

    public void displayMenu()
    {
        System.out.println("Welcome to Cache Creek style Roulette..bet an amount and type");
        System.out.println("\t if you select the correct colour, you win double your bet");
        System.out.println("\t if you select the correct odd/even, you win double your bet if you select the right number, you win 40 times your bet otherwise you lose your bet");
        System.out.println("\t if you lose all your money, the game is over");
    }

    public void checkResult()
    {

        try
        {

            // Parse player bet to Integer
            int playerBet = Integer.parseInt(currentPlayer.getBetString());

            // Check against spin value
            if (playerBet == wheel.getSlotValue())
            {
                System.out.println("Congratulations! You have won $" + currentPlayer.getBetValue() * 40);
                currentPlayer.updatePot(40); // Add a multiplier of 40 to the pot total
            }
            else
            {
                System.out.println("Sorry! You have lost $" + currentPlayer.getBetValue());
                currentPlayer.updatePot(-1); // Subtract the player's bet
            }

        }
        catch (NumberFormatException e)
        {

            boolean addToPot = false;

            // Check the possible win scenarios
            if (wheel.isEven().contentEquals("even") && currentPlayer.getBetString().equalsIgnoreCase("even"))
            {
                addToPot = true;

            }
            else if (wheel.isEven().contentEquals("odd") && currentPlayer.getBetString().equalsIgnoreCase("odd"))
            {
                addToPot = true;

            }
            else if (wheel.getColourValue().contentEquals("red") && currentPlayer.getBetString().equalsIgnoreCase("red"))
            {
                addToPot = true;

            }
            else if (wheel.getColourValue().contentEquals("black") && currentPlayer.getBetString().equalsIgnoreCase("black"))
            {
                addToPot = true;

            }

            // Conditionally add to or remove from the pot
            if (addToPot)
            {
                System.out.println("Congratulations! You have won $" + currentPlayer.getBetValue());
                currentPlayer.updatePot(1); // Update the pot
            }
            else
            {
                System.out.println("Sorry! You have lost $" + currentPlayer.getBetValue());
                currentPlayer.updatePot(-1); // Subtract the player's bet
            }

        }

        // Display the player's pot
        System.out.println("\nYour pot is: $" + currentPlayer.getPot());

        if (currentPlayer.getPot() > 0)
        {
            // Ask to start the game over
            startOver();
        }
        else
        {
            System.out.println("You are the weakest link, Good bye.");
            startOver = false;
        }

    }

    public void startOver()
    {

        boolean error;
        Scanner input = new Scanner(System.in);

        do
        {
            error = false;

            System.out.print("\nDo you want to play again? (y/n) ");
            String playAgain = input.next();

            switch (playAgain.toLowerCase())
            {
                case "y":
                case "yes":
                    startOver = true;
                    break;
                case "n":
                case "no":
                    System.out.println("\nGoodbye!");
                    startOver = false;
                    break;
                default:
                    System.out.println("\nInvalid, please try again!");
                    startOver = false;
                    error = true;
            }
        }
        while (error == true);

    }

    public boolean getStartOver()
    {
        return this.startOver;
    }

}
