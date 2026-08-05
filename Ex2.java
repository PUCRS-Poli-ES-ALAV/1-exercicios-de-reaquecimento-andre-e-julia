public class Ex2 {
    public static void main(String[] args) {
        System.err.println(Ex2.soma2(3, 2));
    }
    public static int soma2(int n1, int n2){
        if(n2>0){
            return soma2(n1 + 1, n2 - 1);
        }
        return n1;
    }
}
