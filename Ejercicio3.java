/*Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
cualquiera por la compra de su aparato. El IVA es del 19%.
Juan Jose Barreto Casilima*/
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preNoIVA;
        String marca;
   
        System.out.print("Ingrese el precio sin IVA del reproductor de música: ");
        preNoIVA = sc.nextDouble();
        sc.nextLine();
       
        System.out.println("Ingrese la marca del reproductor: ");
        marca = sc.nextLine();

        if (preNoIVA >= 500) {
            preNoIVA = preNoIVA * 0.90;
        } preNoIVA = preNoIVA * 1.00;

        if (marca.equals("NOSY")) {
            preNoIVA = preNoIVA*0.95; 
        }   preNoIVA = preNoIVA;
        
        double precioConIVA = preNoIVA * 1.19;
        
        System.out.printf("El precio final a pagar es:" + precioConIVA);

        
    }
}
/*import java.util.Scanner;

//Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA,
//de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un
//5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente
//cualquiera por la compra de su aparato. El IVA es del 19%.
public class REPMUSIC {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); 
    double precio=500, descuento= 0.1, descuentoNosy= 0.05, iva=0.19;
    double precioConIva=0;

    System.out.println("Ingrese el precio del reproductor de música:");
    precio= sc.nextDouble();
    sc.nextLine();
    System.out.println("Ingrese la marca del reproductor de música:");
    String marca= sc.nextLine();
    double precioSinIva=0;
    if (precio>=500){
        precioSinIva=precio-(precio*descuento);
    }
    else{
        precioSinIva=precio;
    }
    if (marca.equals("NOSY")){
        precioSinIva=precioSinIva-(precioSinIva
        *descuentoNosy);
}
    else{marca="Otra marca"; }
    precioConIva=precioSinIva+(precioSinIva*iva);
    System.out.println("El precio del reproductor de música con IVA incluido es: "+precioConIva);

    }
}*/