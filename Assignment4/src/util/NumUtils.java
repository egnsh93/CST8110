// **********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Custom Numeric Utilities class. Any global
// numeric manipulation/check methods should be placed here.

// *********************************************************

package util;

public enum NumUtils
{
    ;

    // Check if a number is odd
    public static boolean isNumOdd(int num)
    {
        if (num % 2 == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
