package ejercicio8;
import java.util.Scanner;
import Utilidades.EsperaDeConsola;

public class Ejercicio8 {
    public static void ejecutar(Scanner scanner) {
        CopiadorCadena procesar = new CopiadorCadena();
        System.out.println("--- Ejercicio 8: Copiar Cadena ---");
        System.out.print("Ingrese una palabra a copiar: ");
        String cadena = scanner.next();
        
        String copia = procesar.copiar(cadena, 0);
        System.out.println("La cadena original es: " + cadena);
        System.out.println("La cadena copiada es: " + copia);
        EsperaDeConsola.esperarYLimpiar(4);
    }
}
