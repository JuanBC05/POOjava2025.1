/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.
Juan Jose Barreto Casilima*/
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas compradas: ");
        int cantLlantas = sc.nextInt();

        int preLLanta;
        if (cantLlantas < 5) {
            preLLanta = 100;
        } else if (cantLlantas >= 5 && cantLlantas <= 10) {
            preLLanta = 75;
        } else {
            preLLanta = 50;
        }

    
        int totalPagar = cantLlantas * preLLanta;


        System.out.println("Precio por llanta: U$" + preLLanta);
        System.out.println("Total a pagar: U$" + totalPagar);

        
    }
}