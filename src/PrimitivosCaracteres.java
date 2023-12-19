public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '2';
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println((decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char espacio = ' ';
        char retroceso = '\b';
        char tabulacion = '\t';
        char retornoCarro = '\r';
        System.out.println("char correspondiendte a \tbyte:"+retroceso+ espacio + Character.BYTES);
        System.out.println("char correspondiendte a bites"+System.lineSeparator()+espacio+ Character.SIZE);
        System.out.println("character.max:"+espacio + Character.MAX_VALUE);
        System.out.println("character min:"+espacio+ Character.MIN_VALUE);
    }

}
