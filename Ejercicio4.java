/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS           % DESCUENTO
    0 - 2                                0%
    2.01 - 5                            10%
    5.01 - 10                           15%
    10.01 en adelante                   20%
Determinar cuánto pagara una persona que compre manzanas en esa frutería.
Juan Jose Barreto Casilima*/
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prexKilo;
        double precioTotal, kiCom, descuento = 0;

        System.out.println("Ingresa el precio por kilo de manzanas: ");
        prexKilo = sc.nextInt();
        System.out.println("Número de kilos comprados: ");
        kiCom = sc.nextDouble();

        if (kiCom <= 2) {
            descuento = 0.0;  // Sin descuento
        } else if (kiCom > 2 && kiCom <= 5) {
            descuento = 0.10;
        } else if (kiCom > 5 && kiCom <= 10) {
            descuento = 0.15;
        } else {
            descuento = 0.20;
        }

        precioTotal = prexKilo * kiCom * (1 - descuento);

        System.out.println("El precio de la compra es de $" + precioTotal);

    }  
}
    