public class Ejercicio6
{
    public static void main(String[] args)
    {
        String[] products =
                { "Café americano", "Capuchino", "Jugo de naranja", "Tostada", "Brownie" };
        double[] prices = {3500, 5000, 4000, 4500, 6000};

        double additionPrices = 0;
        double averagePrices;

        for (int i = 0; i < products.length; i++)
        {
            System.out.printf("%d. %s - $%.2f\n", i + 1, products[i], prices[i]);
            additionPrices += prices[i];
        }

        averagePrices = additionPrices / prices.length;

        System.out.printf("\nPRECIO PROMEDIO: $%.2f", averagePrices);
    }
}
