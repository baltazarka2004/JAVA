public class primitivosFloat {
    static  float varFlotante; // esta en valor por defecto
    public static void main(String[] args) {

        float realFloat = 15.5e4F;    //2120F;
        float realNegativo = 0.000003e-7f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("realNegativo = " + realNegativo);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);


        double realDoble = 3.409681;
        System.out.println("realDoble = " + realDoble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo long correspondeen bites a "+Double.SIZE);
        System.out.println("valor maximo "+ Double.MIN_VALUE);
        System.out.println("valor minimo " + Double.MAX_VALUE);
        
        //float varFlotante;
        System.out.println("varFlotante = " + varFlotante);
    }
}
