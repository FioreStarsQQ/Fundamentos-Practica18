
/*
EJERCICIO 12: Aplicación Smartphone. En un mall una compradora pone en su carrito de compras los artículos que va tomando de los estantes. La
compradora quiere asegurarse de que el cajero le cobre correctamente lo que ella ha comprado, por lo que cada vez que
toma un artículo anota, en su smartphone, la cantidad junto con el precio unitario del artículo tomado y la aplicación debe mostrar
cuánto dinero gastará en ese artículo, cuánto va acumulando en total y cuánto saldo le queda; a esto se le irá sumando lo que irá
gastando en los demás artículos, hasta que decide que ya tomó todo lo que necesitaba o hasta que iguale o pase el presupuesto.
Ayúdale a esta compradora a no pasarse de su presupuesto.
Indicar la cantidad a pagar al final en el cajero
POR: Fiorela Clariza Quispe Quispe
*/
import java.util.*;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidad, respuesta = 1, contadorCompras = 1;
        double costoUnitario, sumaCompra = 0, costoCompraActual = 0, presupuesto;
        System.out.print("Ingrese el valor de su presupuesto para las compras de hoy: ");
        presupuesto = scan.nextDouble();
        while (respuesta == 1) {
            System.out.print("Ingrese el costo unitario del producto N° " + contadorCompras + ":\t");
            costoUnitario = scan.nextDouble();
            System.out.print("Ingrese la cantidad de productos a comprar:\t");
            cantidad = scan.nextInt();
            costoCompraActual = costoUnitario * cantidad * 1.0;
            sumaCompra += costoUnitario * cantidad * 1.0;
            presupuesto -= costoCompraActual;
            if (presupuesto < 0) {
                System.out.println("Costo de la última compra:\tS/. " + String.format("%.2f", costoCompraActual)
                        + "\nSuma de las compras realizadas:\tS/. " + String.format("%.2f", sumaCompra)
                        + "\nSaldo disponible:\tS/. " + String.format("%.2f", presupuesto) + "*"
                        + "\n¿Desea modificar esta última compra? o ¿Desea terminar con la compra del producto anterior?\nPresione 1 si desea modificar otra tecla para terminar la compra...");
                respuesta = scan.nextInt();
                if (respuesta == 1) {
                    sumaCompra -= costoUnitario * cantidad * 1.0;
                    presupuesto += costoCompraActual;
                    continue;
                } else {
                    sumaCompra -= costoCompraActual;
                    System.out.println("La compra excedió su saldo disponible a gastar. El total a pagar se contabilizó hasta el producto N° "
                                    + (contadorCompras - 1));
                    break;
                }
            } else if (presupuesto == 0.00) {
                System.out.println("La compra se detuvo con el último producto ya que no dispone de saldo disponible.");
                break;
            } else if (presupuesto > 0) {
                System.out.println("Costo de la última compra:\tS/. " + String.format("%.2f", costoCompraActual)
                        + "\nSuma de las compras realizadas:\tS/. "
                        + String.format("%.2f", sumaCompra) + "\nSaldo disponible:\tS/. "
                        + String.format("%.2f", presupuesto)
                        + "\n¿Desea seguir comprando?\nPresione 1 si desea continuar otra tecla para salir...");
                respuesta = scan.nextInt();
            }
            contadorCompras++;
        }
        System.out.println("TOTAL A PAGAR:\tS/. " + String.format("%.2f", sumaCompra));
        scan.close();
    }
}