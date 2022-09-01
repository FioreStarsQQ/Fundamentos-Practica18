/*
EJERCICIO 10: Obtener el promedio de calificaciones de un grupo de n alumnos e
indicar si el grupo tiene un promedio aprobatorio (mínima nota
aprobatoria 10.5). Todas las calificaciones son reales y el programa
deberá verificar si cada calificación está en la escala de 0..20
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        double nota, max = 0, min = 0, suma = 0, promedio;
        System.out.print("Ingrese la cantidad de alumnos: ");
        n = scan.nextInt();
        for (int cont = 1; cont <= n; cont++) {
            do {
                System.out.print("Ingrese la nota N° " + cont + ": ");
                nota = scan.nextDouble();
            } while (nota < 0 || nota > 20);
            if (cont == 1) {
                max = nota;
            } else if (nota > max) {
                max = nota;
            }
            if (cont == 1) {
                min = nota;
            } else if (nota < min) {
                min = nota;
            }
            suma += nota;
        }
        scan.close();
        promedio = (double) Math.round(suma * 100 / (n * 1.0)) / 100;
        if (promedio >= 10.5) {
            System.out.println("EL promedio final es: " + promedio + "\tAPROBADOS");
        } else {
            System.out.println("EL promedio final es: " + promedio + "\tDESAPROBADOS");
        }
        System.out.print("La nota mínima fue: " + min + "\nLa nota máxima fue: " + max);
    }
}