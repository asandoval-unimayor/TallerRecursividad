package ejercicio1;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Utilidades.EsperaDeConsola;

public class Ejercicio1 {

    public static void ejecutar(Scanner scanner) {
        
        ProcesarFactorial procesar = new ProcesarFactorial();

        System.out.println("--- Ejercicio 1: Factorial ---");
        System.out.print("Ingrese un numero entero: ");
        int n = scanner.nextInt();
        
        try {
            long resultado = procesar.calcular(n);
            System.out.println("El factorial de " + n + " es: " + resultado);
             EsperaDeConsola.esperarYLimpiar(4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
