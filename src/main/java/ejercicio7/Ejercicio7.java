package ejercicio7;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio7 {
    public static void ejecutar(Scanner scanner) {
        CalculadoraMCD procesar = new CalculadoraMCD();
        System.out.println("--- Ejercicio 7: Maximo Comun Divisor (MCD) ---");
        System.out.print("Ingrese el primer numero (M): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el segundo numero (N): ");
        int n = scanner.nextInt();
        
        int resultado = procesar.calcular(Math.max(m, n), Math.min(m, n));
        System.out.println("El MCD de " + m + " y " + n + " es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
