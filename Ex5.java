public class Ex5 {
    //Gerador da sequência dada por:
    // F(1) = 1
    // F(2) = 2
    // F(n) = 2 ∗ F(n − 1) + 3 ∗ F(n − 2).
    public static void main(String[] args) {
        System.out.println(Func(3));
    }
     public static int Func(int n){
        if(n == 1){
            return 1; 
        }
        if(n == 2){
            return 2;
        }
        return n = (2 * Func(n - 1) + 3 * Func(n - 2));
    }

}