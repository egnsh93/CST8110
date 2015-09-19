// **********************************************************
// Assignment: #4 - Tournament Ladder
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Custom String Utilities class. Any global
// string manipulation methods should be placed here.

// *********************************************************

package util;

import java.util.ArrayList;

public enum StringUtils
{
    ;

    // Check if a String is a numeric
    public static boolean isStringNumeric(String s)
    {
        try
        {
            Double.parseDouble(s);
        }
        catch (NumberFormatException e)
        {
            return false;
        }
        return true;
    }

    // Iterate through a list and check if there is a difference of case in the
    // string
    public static boolean containsIgnoreCase(String str, ArrayList<String> list)
    {
        for (String it : list)
        {
            if (it.equalsIgnoreCase(str)) return true;
        }
        return false;
    }
}
