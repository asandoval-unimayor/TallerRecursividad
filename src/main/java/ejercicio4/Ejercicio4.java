package ejercicio4;

import Utilidades.EsperaDeConsola;
import java.util.Scanner;

public class Ejercicio4 {

    public static void ejecutar(Scanner scanner) {

        SumaDigitos procesador = new SumaDigitos();

        System.out.println("--- Ejercicio 4: Sumar Digitos ---");
        System.out.print("Ingrese un numero entero: ");
        int n= scanner.nextInt();
        int resultado = procesador.sumarDigitos(n);
        
        System.out.println("La suma de los digitos es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }

}
