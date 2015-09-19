// **********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Tournament Ladder using ArrayLists

// *********************************************************

package main;

import controller.LadderController;

public class Assign4
{

    public static void main(String[] args)
    {

        // Instantiate the Controller
        LadderController controller = new LadderController();

        // Begin populating the tournament ladder
        controller.buildLadder();

    }

}
