import java.util.List;
import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        System.out.println(combine(26));
    }
    public static List<String> combine(int n){
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 
                            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                             'W', 'X', 'Y', 'Z'};                     
        if(n == 1){
            List<String> base = new ArrayList<>();
            base.add(String.valueOf(alfabeto[n-1]));
            return base;
        }
        List<String> anteriores = combine(n-1);
        List<String> resultado = new ArrayList<>();
    
        char letraAtual = alfabeto[n - 1];
    
        for(String permutacao : anteriores) {
            
        for(int i = 0; i <= permutacao.length(); i++) {
            String novaPermutacao = permutacao.substring(0, i) + letraAtual + permutacao.substring(i);
            resultado.add(novaPermutacao);
        }
    }
    
    return resultado;
}
}
