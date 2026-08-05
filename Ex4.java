// 4. Inversão de string
public class Ex4 {

    public static void main(String[] args) {
        String palavra = "algoritmo";
        System.out.println(inverter(palavra));
    }

    public static String inverter(String s) {
        if (s.isEmpty()) return s;
        return inverter(s.substring(1)) + s.charAt(0);
    }
}
ui
