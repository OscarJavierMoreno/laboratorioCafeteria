public class Ejercicio5
{
    public static void main(String[] args)
    {
        double cashAMount = 0;
        String message;

        do
        {
            if (cashAMount <= 0)
            {
                message = "Valor NO valido";
                cashAMount = 1000;
            }

            else
            {
                message = "Monto valido: " + cashAMount;
            }

        } while (cashAMount <= 0);

        System.out.println(message);
    }
}

/*
PREGUNTA: ¿Por qué do-while es más apropiado que while aquí?
Describe con tus palabras la diferencia en el orden de ejecución.

R/: En este caso es mejor el "do-while" porque necesitamos que se ejecute al menos una vez
 de lo contrario si solo usamos "while" nunca entraría al bucle porque de entrada la condición
 No se cumple
*/
