import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // resibe datos del usuario del terminal
        System.out.println("ingrese un numero decimal");
        //String numeroStr = scan.nextLine();
        int numeroDecimal = 0;
        try
        {
            numeroDecimal = scan.nextInt(); // convertimos el numero en entro

        }catch (InputMismatchException e)
        {
            System.out.println("error debe de ingresar un numero entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numeroDecimal " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "\nnumero octal de  " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal);

        String mensajeHexa = "nuemro hexadecimal de " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal);



        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += "\n"+ mensajeHexa;

        System.out.println(mensaje);
    }
}
