package ejercicio6;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio6 {
    public static void ejecutar(Scanner scanner) {
        Potencia procesar = new Potencia();
        System.out.println("--- Ejercicio 6: Potencia ---");
        System.out.print("Ingrese la base: ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();
        
        try {
            long resultado = procesar.calcular(base, exponente);
            System.out.println(base + " elevado a " + exponente + " es: " + resultado);
            EsperaDeConsola.esperarYLimpiar(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
