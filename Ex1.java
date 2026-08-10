// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
public class Ex1{

    public static void main(String []args){
        System.out.println(multiDois(6, 2));   
    }

    public static int multiDois(int n1, int n2){
      if(n1 == 1){
        return n2;
      }
      return n2 + multiDois(n1-1, n2);
    
   
}}