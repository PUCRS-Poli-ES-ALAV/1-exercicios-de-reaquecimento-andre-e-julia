public class Ex6 {
    public static void main(String[] args) {
        System.err.println(ack(1, 0));
    }
    
    public static int ack(int m, int n){
        if(m == 0){
            return n+1;
        } else if(m != 0 && n == 0){
            return ack(m-1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
}
