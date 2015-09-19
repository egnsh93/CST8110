import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Discounts
{

    public static void main(String[] args)
    {

        String itemName = "";
        String ageCategory = "";

        int personAge = 0;

        float itemCost = 0.0F;
        float itemDiscount = 0.0F;
        float itemSubtotal = 0.0F;
        float itemTax = 0.0F;
        float itemTotal = 0.0F;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the person's age: ");
        personAge = input.nextInt();

        while (personAge <= 0 || personAge > 120)
        {
            System.err.println("\nYou must enter a number between 1 and 120!\n");
            System.out.println("Enter the person's age: ");
            personAge = input.nextInt();
        }

        System.out.print("Enter the item name: ");
        input.nextLine();
        itemName = input.nextLine();

        System.out.print("Enter the item cost: ");
        itemCost = input.nextFloat();

        while (itemCost < 0)
        {
            System.err.println("You must enter a number greater than 0!\n");
            System.out.println("Enter the item cost: ");
            itemCost = input.nextFloat();
        }

        input.close();

        if (personAge > 65)
        {
            ageCategory = "Senior";

        }
        else if (personAge >= 20 && personAge <= 65)
        {
            ageCategory = "Adult";

        }
        else if (personAge >= 13 && personAge <= 19)
        {
            ageCategory = "Teen";

        }
        else if (personAge >= 10 && personAge <= 12)
        {
            ageCategory = "Pre-teen";

        }
        else if (personAge >= 4 && personAge <= 9)
        {
            ageCategory = "Child";

        }
        else if (personAge >= 2 && personAge <= 3)
        {
            ageCategory = "Toddler";

        }
        else
        {
            ageCategory = "Baby";
        }

        if (personAge <= 9)
        {
            itemDiscount = 0.10F * itemCost;
        }
        else if (personAge >= 65)
        {
            itemDiscount = 0.15F * itemCost;
        }
        else
        {
            itemDiscount = 0.0F * itemCost;
        }

        itemSubtotal = (itemCost - itemDiscount);
        itemTax = (itemSubtotal * 0.13F);
        itemTotal = (itemSubtotal + itemTax);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("\nPrice of " + ageCategory + " " + itemName + " is " + nf.format(itemCost));
        System.out.println(ageCategory + " discount is " + nf.format(itemDiscount));
        System.out.println("Tax is " + nf.format(itemTax));
        System.out.println("Total owed: " + nf.format(itemTotal));

    }

}
