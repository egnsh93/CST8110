public class Assign3
{

    public static void main(String[] args)
    {

        // Instantiate a new Roulette object
        Roulette roulette = new Roulette();

        do
            roulette.newGame();
        while (roulette.getStartOver() == true);

    }

}
