public class Ex7 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4};
        System.out.println(soma(vetor));
        System.out.println(mult(vetor));
    }

    public static int soma(int[] v){
        return soma(0, 0, v);
    }

    public static int soma(int aux, int count, int[] v){
        if(count < v.length){
            return soma(aux + v[count], count + 1, v);
        }
        return aux;
    }

    public static int mult(int[] v){
        return mult(1, 0, v);
    }

    public static int mult(int aux, int count, int[] v){
        if(count < v.length){
            return mult(aux * v[count], count + 1, v);
        }
        return aux;
    }
}
