/*Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
con la siguiente tabla:

Tiempo Utilidad
Menos de 1 año 5 % del salario
1 año o más y menos de 2 años 7% del salario
2 años o más y menos de 5 años 10% del salario
5 años o más y menos de 10 años 15% del salario
10 años o más 20% del salario*/
//Juan Jose Barreto Casilima

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Ingrese el salario mensual del trabajador: ");
        double salMen = sc.nextDouble();

        System.out.print("Ingrese los años de antigüedad en la empresa: ");
        double antigu = sc.nextDouble();

        
        double porcUtilidad = 0.0;

        if (antigu < 1) {
            porcUtilidad = 0.05; 
        } else if (antigu >= 1 && antigu < 2) {
            porcUtilidad = 0.07; 
        } else if (antigu >= 2 && antigu < 5) {
            porcUtilidad = 0.10;
        } else if (antigu >= 5 && antigu < 10) {
            porcUtilidad = 0.15; 
        } else if (antigu >= 10) {
            porcUtilidad = 0.20; 
        }

        double utilidadAnual = salMen * 12 * porcUtilidad;

    
        System.out.println("Porcentaje de utilidad aplicado: " + (porcUtilidad * 100) + "%");
        System.out.println("Utilidad anual: " + utilidadAnual);
    }
}