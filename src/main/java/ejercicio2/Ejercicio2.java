package ejercicio2;
import Utilidades.EsperaDeConsola;
import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar(Scanner scanner) {

        InversorEntero invertir = new InversorEntero();
        System.out.println("--- Ejercicio 2: Invertir Numero ---");
        System.out.print("Ingrese un numero entero: ");
        
        int n = scanner.nextInt();
        int resultado = invertir.numeroInvertido(n);
        
        System.out.println("El numero invertido es: " + resultado);
         EsperaDeConsola.esperarYLimpiar(4);
        
    }
}
