import java.text.DecimalFormat;

public class Ingredient
{

    private double value;
    private String unit;

    public Ingredient()
    {
        value = 0.0;
        unit = "pinches";
    }

    public Ingredient(double value, String unit)
    {
        this.value = value;
        this.unit = unit;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public void convertUnit()
    {

        double newValue = 0.0;

        // Pinches -> Teaspoons
        if (value >= 4)
        {

            newValue = (value / 8.0);
            setValue(newValue);

            if (value == 1)
            {
                setUnit("teaspoon");
            }
            else
            {
                setUnit("teaspoons");
            }

            // Teaspoons -> Tablespoons
            if (value >= 1.5)
            {

                newValue = (value / 3.0);
                setValue(newValue);

                if (value == 1)
                {
                    setUnit("tablespoon");
                }
                else
                {
                    setUnit("tablespoons");
                }

                // Tablespoons -> Cups
                if (value >= 8)
                {

                    newValue = (value / 16.0);
                    setValue(newValue);

                    if (value == 1)
                    {
                        setUnit("cup");
                    }
                    else
                    {
                        setUnit("cups");
                    }

                }
            }
        }

    }

    public String returnAmounts()
    {

        // Subclass of NumberFormat responsible for formatting decimals
        DecimalFormat form = new DecimalFormat();

        form.applyPattern("#.##"); // unlimited before decimal, 2 after decimal

        return form.format(value) + " " + unit;
    }

}