package ejercicio10;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio10 {
    public static void ejecutar(Scanner scanner) {
        Multiplicacion procesar = new Multiplicacion();
        System.out.println("--- Ejercicio 10: Multiplicacion por Sumas Sucesivas ---");
        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();
        
        int resultado = procesar.calcular(a, b);
        System.out.println("El resultado de " + a + " * " + b + " es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
