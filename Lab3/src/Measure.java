// **********************************************************
// Lab: #3 - Arithmetic/Problem Solving
// Author: Shane Egan
// Section: 330
// Lab Teacher: Jiehan Zhou

// Description: Gets value and unit input from the user
// and display the value.

public class Measure
{

    private double value;
    private String unit;

    // Default Constructor
    public Measure()
    {
        value = 1;
        unit = "teaspoon";
    }

    // Initial Constructor
    public Measure(double v, String u)
    {
        value = v;
        unit = u;
    }

    // Responsible for receiving input and display the results
    public void displayAmount()
    {

        // Display the results
        System.out.println(value + " " + unit);

    }

}