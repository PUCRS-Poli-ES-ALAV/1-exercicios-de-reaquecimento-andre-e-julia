public class Ex3 {
    public static void main(String[] args) {
        System.err.println(ex3(3));
    }

    public static double ex3(int n){
        return ex3(0, n);
    }

    public static double ex3(double aux, double n){
        if(n > 0){
            return ex3(aux + 1/n, n-1);
        }
        return aux;
    }
}
