package ejercicio14;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio14 {
    public static void ejecutar(Scanner scanner) {
        Ackerman procesar = new Ackerman();
        System.out.println("--- Ejercicio 14: Funcion de Ackerman ---");
        System.out.print("Ingrese el valor de m: ");
        long m = scanner.nextLong();
        System.out.print("Ingrese el valor de n: ");
        long n = scanner.nextLong();
        
        if (m < 0 || n < 0) {
             System.out.println("Los valores deben ser no negativos.");
             return;
        }
        
        System.out.println("Calculando... (puede demorar para valores altos)");
        long resultado = procesar.calcular(m, n);
        System.out.println("Ackermann(" + m + ", " + n + ") = " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
