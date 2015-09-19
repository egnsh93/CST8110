import java.util.Scanner;

public class Lab6
{

    public static void main(String[] args)
    {

        String numStars = "";
        int userInput = 0;

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter the value: ");
            userInput = input.nextInt();
        }
        while (userInput < 1 || userInput > 20);

        for (int i = 1; i <= userInput; i++)
        {
            numStars += "*";
            System.out.println(numStars);
        }
        input.close();
        for (int j = --userInput; j > 0; j--)
        {
            for (int k = 0; k < j; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}