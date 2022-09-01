
/*
EJERCICIO 15: Crear un juego de dados que consta de lanzamientos de 2 dados
por cada jugador, el juego debe ser iterativo. En cada lanzamiento
se debe simular el lanzamiento de Ud. y de la PC, gana el que
tenga la mayor sumatoria. El programa debe ir contando la cantidad
de lanzamientos y para cada lanzamiento mostrar los resultados de
cada dado por jugador y su sumatoria, así como quién ganó en el
lanzamiento y cómo va quedando el marcador. Al salir debe mostrar
el consolidado de cuantos lanzamientos ganó cada jugador y quién
ganó al final el juego. Considerar empates
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jugador1Dado1, jugador1Dado2, sumaJugador, ganaJugador = 0, computadoraDado1, computadoraDado2,
                sumaComputadora, ganaComputadora = 0, respuesta, empate = 0;
        do {
            jugador1Dado1 = (int) (Math.random() * 6) + 1;
            jugador1Dado2 = (int) (Math.random() * 6) + 1;
            computadoraDado1 = (int) (Math.random() * 6) + 1;
            computadoraDado2 = (int) (Math.random() * 6) + 1;
            sumaJugador = jugador1Dado1 + jugador1Dado2;
            sumaComputadora = computadoraDado1 + computadoraDado2;
            System.out.println("Suma de los dados del jugador:\t" + sumaJugador
                    + "\nSuma de los dados de la computadora:\t" + sumaComputadora);
            if (sumaJugador != sumaComputadora) {
                if (sumaJugador > sumaComputadora) {
                    ganaJugador++;
                } else {
                    ganaComputadora++;
                }
            } else {
                empate++;
                System.out.println(
                        "¡Wow! Lograron empatar en la suma de dados, por lo tanto el marcador se mantiene igual.");
            }
            System.out.println(
                    "****************MARCADOR****************\n- Humano:\t" + ganaJugador + "\n- Computadora:\t"
                            + ganaComputadora);
            System.out.println(
                    "****************************************\n¿Desea seguir jugando?\nPresione 1 si desea continuar otra tecla para salir...");
            respuesta = scan.nextInt();
        } while (respuesta == 1);
        System.out.print("Según el marcador... ");
        if (ganaJugador > ganaComputadora) {
            System.out.println("¡GANASTE!");
        } else if (ganaComputadora > ganaJugador) {
            System.out.println("PERDISTE...");
        } else {
            System.out.println("¡EMPATARON!");
        }
        System.out.println("--- Historial del juego:\n- Partidas jugadas:\t" + (ganaJugador + ganaComputadora + empate)
                + "\n- Partidas ganadas por el jugador:\t" + ganaJugador + "\n- Partidas ganadas por la computadora:\t"
                + ganaComputadora + "\n- Partidas empatadas:\t" + empate);
    }
}