public class FuncaoRecursiva {
    public static void main(String[] args) {
        int[] n = { 1, 2 , 3, 4, 5};
        System.out.println("Fatorial de 5: " + fatorialRecursiva(5));
        System.out.println("Soma da lista { 1, 2, 3, 4, 5} é: " + somarListaRecursiva(n, n.length));
        System.out.println("5 elevado a 5 é: " + potenciacaoRecursiva(5, 5));
        System.out.println("Fibonacci de 5: " + fibonacciRecursiva(5));
        System.out.println("Bucando 4 na lista retornando index: " + buscaBinaria(n, 0, n.length, 4));
        
    }

    public static int fatorialRecursiva(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fatorialRecursiva(n - 1);
    }
    
    public static int somarListaRecursiva(int[] n, int tamanho) {
        
        if (tamanho == 1){
            return  n[0];
        }

        return n[tamanho - 1] + somarListaRecursiva(n, tamanho - 1);
    }

    public static int potenciacaoRecursiva(int x, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return x * potenciacaoRecursiva(x, expoente - 1);
    }

    public static int fibonacciRecursiva(int n) {
        if (n == 0) {
            return 0;
        }

        return n + fibonacciRecursiva(n - 1);
    }

    public static int buscaBinaria(int[] lista, int inicio, int fim, int itemProcurado) {
        int meio = (inicio + fim) / 2;
        
        if (inicio > fim) {
            return -1;
        }

        if (lista[meio] == itemProcurado) {
            return meio;
        } else if (itemProcurado < lista[meio]) {
            return buscaBinaria(lista, inicio, meio - 1, itemProcurado);
        } else {
            return buscaBinaria(lista, meio + 1, fim, itemProcurado);
        }
    }
}