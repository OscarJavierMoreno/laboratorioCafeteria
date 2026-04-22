public class Ejercicio7
{
    public static void main(String[] args)
    {
        int cantidadVendida = "5";
        double precioUnitario = 4500;
        double total = cantidadVendida * precioUnitario
        boolean aplicaDescuento = (total > 20000);

        if (aplicaDescuento = true)
        {
            total = total - (total * 0.10);
        }

        System.out.println("Total: " + total);
    }
}

/*
Pregunta: ¿Cuántos errores encontraste?
R/: Encontré un total de 3 errores.

Clasifica cada uno: ¿es un error de compilación o un error lógico?
R/:

ERROR #1: int cantidadVendida = "5";
Está guardando un String dentro de un entero.

ERROR #2: double total = cantidadVendida * precioUnitario
Falta el punto y coma al final

ERROR #3: if (aplicaDescuento = true)
El error ocurre porque se usa "= (asignación)" en lugar de "=== (comparación)".

¿Cómo los distingues?
*/
