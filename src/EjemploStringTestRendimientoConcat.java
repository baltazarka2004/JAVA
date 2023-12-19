public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicial = System.currentTimeMillis();

        for (int i = 0 ;i < 1000; i++)
        {
            //c += a + b + "\n"; 19 milisegundo
            sb.append(a).append(b).append("\n"); // 0 ms con 500 con 1000 tmb
        }


        long fin = System.currentTimeMillis();

        System.out.println(fin - inicial);
        System.out.println(c);
        System.out.println("sb = " + sb);
    }
}
