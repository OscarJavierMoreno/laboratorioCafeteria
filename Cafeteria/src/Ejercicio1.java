public class Ejercicio1
{
    public static void main(String[] args)
    {
        //Sección Variables
        String productName = "Café americano";
        double unitProduct = 3500.50;
        int quantityInventory = 20;
        boolean availableToday = true;
        char productCode = 'A';

        //Impresión
        String message = String.format(
                "Producto: %s\nPrecio: %.2f\nInventario: %d\nDisponible: %b\nCódigo: %c",
                productName,
                unitProduct,
                quantityInventory,
                availableToday,
                productCode
        );

        System.out.println(message);
    }

}
