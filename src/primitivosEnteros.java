public class primitivosEnteros {
    public static void main(String[] args) {

        byte numero = 127;
        System.out.println("numero = " + numero);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a "+Byte.SIZE);
        System.out.println("valor maximo "+ Byte.MIN_VALUE);
        System.out.println("valor minimo " + Byte.MAX_VALUE);

        short numeroshort = 3000;
        System.out.println("\nnumero = " + numeroshort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a "+Short.SIZE);
        System.out.println("valor maximo "+ Short.MIN_VALUE);
        System.out.println("valor minimo " + Short.MAX_VALUE);

        int numeroInt = 2147483647;
        System.out.println("\nnumero = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a "+Integer.SIZE);
        System.out.println("valor maximo "+ Integer.MIN_VALUE);
        System.out.println("valor minimo " + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long correspondeen bites a "+Long.SIZE);
        System.out.println("valor maximo "+ Long.MIN_VALUE);
        System.out.println("valor minimo " + Long.MAX_VALUE);


        var numeroVar = 127313231231233323232D;

    }
}
