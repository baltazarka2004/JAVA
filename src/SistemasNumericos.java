import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null,"ingrese un numero decimal");
        int numeroDecimal = 0;
        try
        {
            numeroDecimal = Integer.parseInt(numeroStr); // convertimos el numero en entro

        }catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,"error debe de ingresar un numero entero");
            main(args);
            System.exit(0);
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        System.out.println(mensajeBinario);
        
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = ("\nnumero octal de  " + numeroDecimal + " = "+ Integer.toOctalString(numeroDecimal));

        System.out.println(mensajeOctal);

        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexa = ("nuemro hexadecimal de " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal));

        System.out.println(mensajeHexa);
        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = mensajeBinario;
        mensaje += mensajeOctal;
        mensaje += "\n"+ mensajeHexa;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
