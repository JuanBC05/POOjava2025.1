/*Una institución educativa estableció un programa para estimular a los alumnos con buen
rendimiento académico y que consiste en lo siguiente:
▪ Si el prom es de 9.5 o más y el alumno es de tecnología, entonces este podrá cursar
55 créditos y se le hará un 25% de desc.
▪ Si el prom es mayor o igual a 9 pero menor que 9.5 y el alumno es de tecnología,
entonces este podrá cursar 50 créditos y se le hará un 10% de desc.
▪ Si el prom es mayor que 7 y menor que 9 y el alumno es de tecnología, este podrá
cursar 50 créditos y no tendrá ningún desc.
▪ Si el prom es de 7 o menor, el número de materias reprobadas es de 0 a 3 y el
alumno es de tecnología, entonces podrá cursar 45 créditos y no tendrá desc.

▪ Si el prom es de 7 o menor, el número de materias reprobadas es de 4 o más y el
alumno es de tecnología, entonces podrá cursar 40 créditos y no tendrá ningún
desc.
▪ Si el prom es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá
cursar 55 créditos y se le hará un 20% de desc.
▪ Si el prom es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55
créditos y no tendrá desc.
Obtener el total que tendrá que pagar un alumno si el valor de la matrícula para alumnos de
profesional es de $30.000 por cada cinco créditos y para alumnos de tecnología es de $18.000
por cada cinco créditos.*/
//Juan Jose Barreto Casilima

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el promedio: ");
        double prom = sc.nextDouble();

        System.out.print("Ingrese el número de materias reprobadas: ");
        int matsRepro = sc.nextInt();

        System.out.print("Ingrese el tipo de carrera (tecnologia/profesional): ");
        String tipCarr = sc.next().toLowerCase();

        
        int creditos = 0;
        double desc = 0.0;

        if (tipCarr.equals("tecnologia")) {
            if (prom >= 9.5) {
                creditos = 55;
                desc = 0.25;
            } else if (prom >= 9 && prom < 9.5) {
                creditos = 50;
                desc = 0.10;
            } else if (prom > 7 && prom < 9) {
                creditos = 50;
                desc = 0.0;
            } else if (prom <= 7 && matsRepro >= 0 && matsRepro <= 3) {
                creditos = 45;
                desc = 0.0;
            } else if (prom <= 7 && matsRepro >= 4) {
                creditos = 40;
                desc = 0.0;
            }
        } else if (tipCarr.equals("profesional")) {
            if (prom >= 9.5) {
                creditos = 55;
                desc = 0.20;
            } else {
                creditos = 55;
                desc = 0.0;
            }
        } else {
            System.out.println("Error, carrera no existente.");
            return;
        }

       
        double costCinCred = tipCarr.equals("tecnologia") ? 18000 : 30000;
        double costoTotal = (creditos / 5) * costCinCred;
        double descApli = costoTotal * desc;
        double totalPagar = costoTotal - descApli;

        System.out.println("Créditos a cursar: " + creditos);
        System.out.println("desc aplicado: " + desc);
        System.out.println("Total a pagar: " + totalPagar);
    }
}
