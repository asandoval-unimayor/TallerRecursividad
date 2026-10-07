package ejercicio11;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio11 {
    public static void ejecutar(Scanner scanner) {
        SumaArreglo procesar = new SumaArreglo();
        System.out.println("--- Ejercicio 11: Suma de Elementos de un Arreglo ---");
        System.out.print("Ingrese la cantidad de elementos n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
             System.out.println("La cantidad debe ser mayor a 0.");
             return;
        }
        int[] arreglo = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posicion " + i + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        int resultado = procesar.calcular(arreglo, n);
        System.out.println("La suma de los elementos del arreglo es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
