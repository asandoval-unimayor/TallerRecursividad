package ejercicio9;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio9 {
    public static void ejecutar(Scanner scanner) {
        DivisionEntera procesar = new DivisionEntera();
        System.out.println("--- Ejercicio 9: Cociente de Division Entera ---");
        System.out.print("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = scanner.nextInt();
        
        try {
            int resultado = procesar.calcular(dividendo, divisor);
            System.out.println("El cociente de " + dividendo + " / " + divisor + " es: " + resultado);
            EsperaDeConsola.esperarYLimpiar(4);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
