//**********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: This class is responsible for handling the
// data provided by the Model and View classes. It performs
// basic data validation in addition to determining the 
// player matchups.

//*********************************************************
package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.PlayerModel;
import view.LadderView;

public class LadderController
{

    private PlayerModel playerModel;
    private LadderView ladderView;

    public LadderController()
    {
        playerModel = new PlayerModel();
        ladderView = new LadderView();
    }

    public void buildLadder()
    {
        // Check if the ladder size is valid
        validateLadder();

        // Iterate through the ladder
        for (int i = 1; i <= ladderView.getLadderSize(); i++)
        {
            do
            {
                // Prompt the user to enter a new player while the previous
                // player was valid
                ladderView.setLadderPlayers(i);
            }
            while (isValidPlayer(ladderView.getLadderPlayers()) == true);
        }

        // Display the Tournament Matchup Header
        ladderView.displayMenu();
        
        // Match Players with each other
        matchPlayers();
    }

    public void validateLadder()
    {
        boolean error = false;

        do
        {
            try
            {
                // Set the size of the ladder
                ladderView.setLadderSize();

                // Reset the error flag
                error = false;

                // Set error flag if ladder size is less than two
                if (ladderView.getLadderSize() < 2)
                {
                    System.err.println("\nLadder size must be greater than or equal to two, please try again\n");
                    error = true;
                }

            }
            catch (InputMismatchException e)
            {
                // Catch non-integer entries
                System.err.println("\nYou must enter a valid number. Please try again\n");
                error = true;
            }
        }
        while (error);
    }

    public boolean isValidPlayer(String playerName)
    {
        boolean error = false;

        // Set error flag if the user entry is of numeric value or empty
        if (util.StringUtils.isStringNumeric(playerName) || playerName.isEmpty())
        {
            error = true;
            System.err.println("Invalid input. Please try again.\n");
        }
        else
        {
            // Ignore the case on the player name
            boolean hasDifferentCase = util.StringUtils.containsIgnoreCase(playerName, playerModel.getPlayerNames());

            // If duplicate name found in ArrayList (case insensitive),
            // trigger error
            if (playerModel.getPlayerNames().contains(playerName) || hasDifferentCase)
            {
                System.out.println("Player '" + playerName.toLowerCase() + "' already exists, please retry");
                error = true;
            }
            else
            {
                // Otherwise add the player to the list
                playerModel.addPlayerNames(playerName);
                error = false;
            }
        }
        return error;
    }

    public void matchPlayers()
    {
        // Define first, middle, and last players
        int topPlayer = 0;
        int middlePlayer = playerModel.getPlayerNames().size() / 2;
        int lastPlayer = playerModel.getPlayerNames().size() - 1;

        // Get the last player name in the ArrayList
        String playerBye = playerModel.getPlayerNames().get(lastPlayer);
        
        while (topPlayer < playerModel.getPlayerNames().size() / 2)
        {
            // Display the match results
            ladderView
                    .displayResults(playerModel.getPlayerNames().get(topPlayer), playerModel.getPlayerNames().get(middlePlayer));

            // Increment the index of the top and middle players
            topPlayer++;
            middlePlayer++;
        }

        // If odd number of players, the last player in the list gets a bye
        if (util.NumUtils.isNumOdd(ladderView.getLadderSize()))
        {
            System.out.println(playerBye + " gets a bye");
        }
    }

}
