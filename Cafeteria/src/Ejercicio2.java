public class Ejercicio2
{
    public static void main(String[] args)
    {
        //Variables
        double order = 30000;
        double subtotal = 42500;
        int discountPercentage = 15;
        double discountAmount = 0;
        double discount = 0;
        boolean hasDiscount = subtotal > order;

        if (hasDiscount)
        {
            discountAmount = (subtotal * discountPercentage) / 100;
            discount = subtotal - discountAmount;
        }

        String printResults = String.format("Descuento: %.2f\nTotal a pagar: %.2f\nAplica descuento: %b\n",
                discountAmount, discount, hasDiscount);

        System.out.printf(printResults);

    }
}
