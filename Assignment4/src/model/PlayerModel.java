// **********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: This class is responsible for adding
// player data to the ArrayList

// *********************************************************

package model;

import java.util.ArrayList;

public class PlayerModel
{

    private String playerName;
    private ArrayList<String> playerList;

    public PlayerModel()
    {
        playerName = null;
        playerList = new ArrayList<String>();
    }

    // Adds a play to the ArrayList
    public void addPlayerNames(String playerName)
    {
        this.playerList.add(playerName);
    }

    // Get the ArrayList
    public ArrayList<String> getPlayerNames()
    {
        return playerList;
    }

}
