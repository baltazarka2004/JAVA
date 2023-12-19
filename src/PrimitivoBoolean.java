public class PrimitivoBoolean {
    public static void main(String[] args) {

        boolean datoLogico = true; // sirve para los flujos de control
        System.out.println("dato: "+ datoLogico);

        double d =  98765.43e-3; // 98.76543
        float f = 1.234e5f;

        datoLogico = (d > f);
        System.out.println("datoLogico = " + datoLogico);
        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);



    }

}
