import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeLaFactura {
    public static void main(String[] args) {
        double precio1 = 0;
        double precio2 = 0;
        double total = 0;
        float impuesto = 1.19f;
        double impuesto2 = 0;
        double  totalConImpuesto = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar nombre de la factura o descripcion: ");
        String factura = scan.nextLine();
        System.out.println("\ningresar precio 1: ");
        precio1 = scan.nextDouble();
        System.out.println("\ningrese siguiente precio : ");
        precio2 = scan.nextDouble();
        total = precio1 + precio2;
        impuesto2 = (total * impuesto) - total;
        totalConImpuesto  = total * impuesto;
        System.out.println("\nla factura "+factura+" tiene un total bruto de "+total+", con un impuesto de "+impuesto2+" y el monto despues de impuesto es de "+totalConImpuesto);
    }
}
