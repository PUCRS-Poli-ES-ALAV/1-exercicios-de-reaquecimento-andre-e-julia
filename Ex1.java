// Multiplicação de dois números naturais, através de somas sucessivas (Ex.: 6 ∗ 4 = 4 + 4 + 4 + 4 + 4 + 4).
public Ex1{
    public void main(String []args){
        
    }

    public int multiDois(int n1, int n2){
        if(n1 != 0){
            return n2 += n2; 
        }
        return n2; 

    }
}