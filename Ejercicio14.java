
/*
EJERCICIO 14: Otra de Smartphones. Una persona que va de compras a la tienda
“SODOMA S.A.”, decide llevar un control sobre lo que va
comprando, para saber la cantidad de dinero que tendrá que pagar
al llegar a la caja. La tienda tiene una promoción del 20% de
descuento sobre aquellos artículos cuya etiqueta sea roja. Indicar
la cantidad que debe pagar al final. Presupuesto ilimitado!!!
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cantidad, costoUnitario, etiqueta, total = 0, costoProducto;
        int respuesta = 1;
        for (int n = 1; respuesta == 1; n++) {
            System.out.print("Ingrese el costo unitario del producto N° " + n + ":\t");
            costoUnitario = scan.nextDouble();
            System.out.print("Ingrese la cantidad de productos a comprar:\t");
            cantidad = scan.nextInt();
            System.out.println(
                    "¿Este producto tiene etiqueta roja?\nPresione 1 si es asi u otra tecla para continuar...");
            etiqueta = scan.nextInt();
            costoProducto = costoUnitario * cantidad * 1.0;
            if (etiqueta == 1) {
                costoProducto *= 0.80;
            }
            total = (double) Math.round((total + costoProducto) * 100) / 100;
            System.out.println("¿Desea seguir comprando?\nPresione 1 si desea continuar otra tecla para salir...");
            respuesta = scan.nextInt();
        }
        System.out.println("TOTAL A PAGAR:\tS/. " + String.format("%.2f", total));
        scan.close();
    }
}