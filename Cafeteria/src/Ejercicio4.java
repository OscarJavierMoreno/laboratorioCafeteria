public class Ejercicio4
{
    public static void main(String[] args)
    {
        int units = 50;
        int consumptionPerOrder = 2;

        while (units >= 10)
        {
            units -= consumptionPerOrder;

            System.out.println("Quedan: " + units + " unidades de café");
        }

        System.out.println("\nQuedan menos de 10 unidades de café, VENTAS DETENIDAS");
    }

    /* PREGUNTA:
    ¿Qué ocurre si la condición del while nunca se vuelve falsa?
    R/: El bucle sería infinito haciendo que el programa No avance y se quede pegado

    ¿Cómo lo prevendrías en este caso?
    R/: Se previene asegurando que la variable que controla la condición cambie dentro del ciclo.

    */
}
