public class EX1 {
    public static void main(String[] args) throws Exception {
        int x = 10;
        String Result1 = (x % 2 == 0) ? "par" : "ímpar";
        String Result2 = (x > 0) ? "positivo" : "negativo";
        System.out.println(x + " é " + Result1 + " e " + Result2 + ".");
    }
}
