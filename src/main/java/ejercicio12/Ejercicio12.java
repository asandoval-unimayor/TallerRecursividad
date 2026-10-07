package ejercicio12;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio12 {
    public static void ejecutar(Scanner scanner) {
        SumaMatriz procesar = new SumaMatriz();
        System.out.println("--- Ejercicio 12: Suma de Elementos de una Matriz ---");
        System.out.print("Ingrese el numero de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el numero de columnas (n): ");
        int n = scanner.nextInt();
        
        if (m <= 0 || n <= 0) {
             System.out.println("Las dimensiones deben ser mayores a 0.");
             return;
        }
        
        int[][] matriz = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Ingrese el valor para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        int resultado = procesar.calcular(matriz, 0, 0);
        System.out.println("La suma de los elementos de la matriz es: " + resultado);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
