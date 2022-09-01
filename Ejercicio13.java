
/*
EJERCICIO 13: En el Congreso de la República se levanta una encuesta con todos
los congresistas con el fin de determinar qué porcentaje de los
congresistas está a favor de una ley cualquiera, qué porcentaje
está en contra y qué porcentaje se abstiene de opinar. Voto uno por
uno. Como en la vida real no se sabe cuántos asistirán!!!
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCongresista = 0, voto = 1, contadorVotos1 = 0, contadorVotos2 = 0, contadorVotos3 = 0;
        double porcentajeFavor, porcentajeContra, porcentajeAbstenciones;
        System.out.println(
                "DATO: Para registrar el voto presione...\n[1] Voto a favor\n[2] Voto en contra\n[3] Abstención\n[] Cualquier otro número para salir");
        // for (numCongresista = 1;!(voto<1 || voto > 3); numCongresista++) {
        while (!(voto < 1 || voto > 3)) {
            numCongresista++;
            System.out.print("Ingrese el voto N°" + numCongresista + ": ");
            voto = scan.nextInt();
            switch (voto) {
                case 1:
                    contadorVotos1++;
                    break;
                case 2:
                    contadorVotos2++;
                    break;
                case 3:
                    contadorVotos3++;
                    break;
                default:
                    numCongresista--;
            }
        }
        porcentajeFavor = (double) Math.round(1.0 * contadorVotos1 * 10000 / (1.0 * numCongresista))/100;
        porcentajeContra = (double) Math.round(1.0 * contadorVotos2 * 10000 / (1.0 * numCongresista))/100;
        porcentajeAbstenciones = (double) Math.round(1.0 * contadorVotos3 * 10000 / (1.0 * numCongresista))/100;
        System.out.println("Total de congresistas que asistieron: " + numCongresista
                + "\nResultados del proceso:\n- A favor de la ley:\t" + porcentajeFavor + " %\n- En contra de la ley:\t"
                + porcentajeContra + " %\n- En contra de la ley:\t" + porcentajeAbstenciones + " %");
        scan.close();
    }
}