public class Ejercicio3
{
    public static void main(String[] args)
    {
        char category = 'B';

        String description = switch(category)
        {
            case 'B' -> "Bebida caliente - IVA: 0%";
            case 'F' -> "Bebida fría - IVA: 5%";
            case 'C' -> "Comida - IVA: 8%";
            case 'P' -> "Postre - IVA: 8%";
            default -> "Categoría no reconocida";
        };

        System.out.println(description);
    }
}
