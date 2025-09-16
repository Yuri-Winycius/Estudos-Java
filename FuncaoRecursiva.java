public class FuncaoRecursiva {
    public static void main(String[] args) {
        int[] n = { 1, 2 , 3, 4, 5};
        System.out.println("Fatorial de 5: " + fatorialRecursiva(5));
        System.out.println("Soma da lista { 1, 2, 3, 4, 5} é: " + somarListaRecursiva(n, n.length));
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
}
