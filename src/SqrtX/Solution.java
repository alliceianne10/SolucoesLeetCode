package SqrtX;

class Solution {
    public int mySqrt(int x) {

        if (x <= 1) {
            return x;
        }

        int inicio = 1;
        int fim = x;
        int resposta = 0;


        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            long quadrado = (long) meio * meio;

            if (quadrado == x){
                return meio;
            } else if (quadrado < x) {
                resposta = meio;
                inicio = meio + 1;
            }else{
                fim = meio - 1;
            }
        }
        return  resposta;
    }
}

