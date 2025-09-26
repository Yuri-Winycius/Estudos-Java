package estrutura.pilha;

public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.exibir(); // Topo -> 30 20 10

        System.out.println("Topo da pilha: " + pilha.peek()); // 30

        System.out.println("Removido: " + pilha.pop()); // 30
        pilha.exibir(); // Topo -> 20 10

        System.out.println("Removido: " + pilha.pop()); // 20
        pilha.exibir(); // Topo -> 10
    }
}