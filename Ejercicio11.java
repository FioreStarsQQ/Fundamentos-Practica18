
/*
EJERCICIO 11: Programa iterativo que permita determinar todos los divisores y la
cantidad de los mismos de un número entero positivo ingresado por
el teclado
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, sumaFactores = 0, respuesta = 1;
        while (respuesta == 1) {
            do {
                System.out.print("Ingrese un número: ");
                num = scan.nextInt();
            } while (num < 0);
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println(i);
                    sumaFactores++;
                }
            }
            System.out.println("El total de divisores es: " + sumaFactores);
            System.out.println("¿Desea continuar?\nPresione 1 si desea continuar otra tecla para salir...");
            respuesta = scan.nextInt();
            sumaFactores = 0;
        }
        scan.close();
    }
}