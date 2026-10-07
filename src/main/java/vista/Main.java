package vista;
import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import ejercicio5.Ejercicio5;
import ejercicio6.Ejercicio6;
import ejercicio7.Ejercicio7;
import ejercicio8.Ejercicio8;
import ejercicio9.Ejercicio9;
import ejercicio10.Ejercicio10;
import ejercicio11.Ejercicio11;
import ejercicio12.Ejercicio12;
import ejercicio13.Ejercicio13;
import ejercicio14.Ejercicio14;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        while (menu) {

            System.out.println("MENU PRINCIPAL - Seleccione el indice del ejercicio");

            for (int i = 1; i <= 14; i++) {
                System.out.println("Ejercicio " + i);
            }
            System.out.println("0. Salir");

            int respuesta = scanner.nextInt();
            System.out.println("\n \n \n");

            switch (respuesta) {
                case 1 -> Ejercicio1.ejecutar(scanner);
                case 2 -> Ejercicio2.ejecutar(scanner);
                case 3 -> Ejercicio3.ejecutar(scanner);
                case 4 -> Ejercicio4.ejecutar(scanner);
                case 5 -> Ejercicio5.ejecutar(scanner);
                case 6 -> Ejercicio6.ejecutar(scanner);
                case 7 -> Ejercicio7.ejecutar(scanner);
                case 8 -> Ejercicio8.ejecutar(scanner);
                case 9 -> Ejercicio9.ejecutar(scanner);
                case 10 -> Ejercicio10.ejecutar(scanner);
                case 11 -> Ejercicio11.ejecutar(scanner);
                case 12 -> Ejercicio12.ejecutar(scanner);
                case 13 -> Ejercicio13.ejecutar(scanner);
                case 14 -> Ejercicio14.ejecutar(scanner);
                case 0 -> {
                    menu = false;
                    System.out.println("Saliendo...");
                }
                default -> JOptionPane.showMessageDialog(null, "Opcion no valida");
            }

        }

        scanner.close();
    }
}
