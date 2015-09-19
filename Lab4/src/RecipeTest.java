public class RecipeTest
{

    public static void main(String[] args)
    {

        Recipe recipe = new Recipe();

        int numberOfCookies = recipe.getNumberOfCookies();

        recipe.calculateAmounts(numberOfCookies);
        recipe.displayRecipe();

    }

}
