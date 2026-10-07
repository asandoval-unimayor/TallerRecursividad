package ejercicio5;

import Utilidades.EsperaDeConsola;
import ejercicio4.SumaDigitos;
import java.util.Scanner;

public class Ejercicio5 {

    public static void ejecutar(Scanner scanner) {

        SumatoriaHastaNumeroLeido procesador = new SumatoriaHastaNumeroLeido();

        System.out.println("--- Ejercicio 5: Sumatoria hasta N ---");
        System.out.print("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        int resultado = procesador.calcular(n);

        System.out.println("La suma de los digitos es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
