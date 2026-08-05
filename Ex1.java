// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
public class Ex1{

    public static void main(String []args){

        System.out.println(multiDois(6, 1));
       // System.out.println(Func(10));
   
    }

    public static int multiDois(int n1, int n2){
        if(n1 != 0){
            n1--;
            n2 += n2; 
            return multiDois(n1, n2); 
        }
        return n2; 
    }

    public static int Func(int n){
        if(n != 0){
         return n = 2 * Func(n - 1) + 3 * Func(n - 2);
        }
        return n; 
    }

}