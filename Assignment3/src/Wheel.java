import java.util.Random;

public class Wheel
{

    private int slotValue;
    private String colourValue;

    public void spin()
    {

        Random random = new Random();

        slotValue = random.nextInt(40); // Random number between 0-39
        colourValue = random.nextInt(2) == 1 ? "black" : "red"; // Determine red or black

    }

    public int getSlotValue()
    {
        return this.slotValue;
    }

    public String getColourValue()
    {
        return this.colourValue;
    }

    public String isEven()
    {

        if (getSlotValue() % 2 == 0)
        {
            return "even";
        }
        else
        {
            return "odd";
        }

    }

    public void displaySpin()
    {
        System.out.println("\nSpin Result: " + getSlotValue() + " " + getColourValue());
    }

}
