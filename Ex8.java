//8. Verifique se uma palavra é palíndromo (Ex. aba, abcba, xyzzyx)
public class Ex8 {

    public static void main(String[] args) {
        System.out.println(ehPalindromo("abcba"));
    }

    public static boolean ehPalindromo(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return ehPalindromo(s.substring(1, s.length() - 1));
    }
}

