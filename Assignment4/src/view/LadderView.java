// **********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: This class is responsible for the
// input/output of data

// *********************************************************

package view;

import java.util.Scanner;

public class LadderView
{

    private int ladderSize;
    private String playerName;
    private Scanner input = new Scanner(System.in);

    public void setLadderSize()
    {
        System.out.print("How many players are participating in this tournament ladder: ");

        Scanner input = new Scanner(System.in);

        // Set the ladder size
        ladderSize = input.nextInt();
        input.nextLine();
    }

    public int getLadderSize()
    {
        return ladderSize;
    }

    public void setLadderPlayers(int playerNum)
    {
        // Get the player name from the user
        System.out.print("Enter player " + playerNum + ": ");
        playerName = input.nextLine();
    }

    public String getLadderPlayers()
    {
        return playerName;
    }

    public void displayMenu()
    {
        System.out.println("\nTournament Ladder");
        System.out.println("-----------------");
    }

    public void displayResults(String player1, String player2)
    {
        System.out.println(player1 + " - " + player2);
    }

}
