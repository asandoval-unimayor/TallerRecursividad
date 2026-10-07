package ejercicio13;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio13 {
    public static void ejecutar(Scanner scanner) {
        Fibonacci procesar = new Fibonacci();
        System.out.println("--- Ejercicio 13: Serie de Fibonacci ---");
        System.out.print("Ingrese el valor limite para la serie: ");
        int limite = scanner.nextInt();
        
        System.out.print("Serie de Fibonacci hasta " + limite + ": ");
        int i = 0;
        int valor;
        while (true) {
            valor = procesar.calcular(i);
            if (valor > limite) break;
            if (i > 0) System.out.print(", ");
            System.out.print(valor);
            i++;
        }
        System.out.println();
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
