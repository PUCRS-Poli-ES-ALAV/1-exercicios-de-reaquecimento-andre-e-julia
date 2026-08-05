public class Ex5 {
     public static int Func(int n){
        if(n != 0){
         return n = 2 * Func(n - 1) + 3 * Func(n - 2);
        }
        return n; 
    }

}
