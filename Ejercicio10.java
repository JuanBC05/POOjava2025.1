/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra.*/

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);


        System.out.print("Horas trabajadas: ");       
        int horasTra = sc.nextInt();
        int valorHora = 5000;
        double pago = 0, pago2 = 0;
        double aumento = 1.20;
        int horaExtra = horasTra - 40;
        double pagoHoraExtra = horaExtra * (valorHora * aumento);

        if (horasTra <= 40) {
            pago2 = 5000 * horasTra;
        }else {
            pago = (horasTra * valorHora) + pagoHoraExtra;
        }
        System.out.println("Pago sin horas extras: "+pago2);
        System.out.println("Pago total: "+pago);
    }
}
