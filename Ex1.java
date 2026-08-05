// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
public class Ex1{

    public static void main(String []args){
        System.out.println(multiDois(6, 1));   
    }

    public static int multiDois(int n1, int n2){
        if(n1 != 0){
            n1--;
            n2 += n2; 
            return multiDois(n1, n2); 
        }
        return n2; 
    }

   
}