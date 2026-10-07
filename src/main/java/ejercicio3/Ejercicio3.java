package ejercicio3;

import Utilidades.EsperaDeConsola;
import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(Scanner scanner) {

        SumatoriaEntero procesar = new SumatoriaEntero();

        System.out.println("--- Ejercicio 3: Sumatoria 1 + 1/2 + ... ---");
        System.out.print("Ingrese un numero entero n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor ingrese un numero mayor a 0.");
        } else {
            double resultado = procesar.calcular(n);
            System.out.println("El resultado es: " + resultado);
            EsperaDeConsola.esperarYLimpiar(4);
        }
    }

}
