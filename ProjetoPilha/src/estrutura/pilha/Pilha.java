package estrutura.pilha;

public class Pilha {
    private No topo;

    public Pilha() {
        this.topo = null;
    }

    // Verifica se está vazia
    public boolean isEmpty() {
        return topo == null;
    }

    // Push: insere no topo
    public void push(int valor) {
        No novo = new No(valor);
        novo.proximo = topo;
        topo = novo;
    }

    // Pop: remove e retorna o topo
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        int valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    // Peek: consulta o topo
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.valor;
    }

    // Mostrar a pilha
    public void exibir() {
        No atual = topo;
        System.out.print("Topo -> ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}