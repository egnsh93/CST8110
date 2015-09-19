import java.util.Scanner;

public class MeasureTest
{

    public static void main(String[] args)
    {

        // using the default constructor
        Measure measure = new Measure();
        System.out.print("Initial amount is ");
        measure.displayAmount();

        // get value and unit
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value: ");
        double value = input.nextDouble();

        System.out.print("Enter unit: ");
        String unit = input.next();

        input.close();

        // using the initial constructor
        measure = new Measure(value, unit);
        System.out.print("Amount is ");
        measure.displayAmount();
    }

}
