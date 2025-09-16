import java.util.Scanner;

public class Matrix3D {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Quantas turmas? ");
            int qtdTurmas = sc.nextInt();
            
            float[][][] notas = new float[qtdTurmas][][]; 
            int[] qtdAlunos = new int[qtdTurmas];
            int[] qtdNotas = new int[qtdTurmas];
            
            for (int i = 0; i < qtdTurmas; i++) {
                System.out.println("\nTurma " + (i + 1) + ":");
                
                System.out.print("Quantos alunos na turma " + (i + 1) + "? ");
                qtdAlunos[i] = sc.nextInt();
                
                System.out.print("Quantas notas por aluno? ");
                qtdNotas[i] = sc.nextInt();
                
                notas[i] = new float[qtdAlunos[i]][]; 
                
                for (int j = 0; j < qtdAlunos[i]; j++) {
                    notas[i][j] = new float[qtdNotas[i]]; 
                    
                    System.out.println("\nAluno " + (j + 1) + ":");
                    for (int k = 0; k < qtdNotas[i]; k++) {
                        System.out.print("Nota " + (k + 1) + ": ");
                        notas[i][j][k] = sc.nextFloat();
                    }
                }
            }
            
            // Impressão
            for (int i = 0; i < qtdTurmas; i++) {
                System.out.println("\nTurma " + (i + 1) + ":");
                for (int j = 0; j < qtdAlunos[i]; j++) {
                    System.out.println("Notas do aluno " + (j + 1) + ":");
                    for (int k = 0; k < qtdNotas[i]; k++) {
                        System.out.printf("  Nota %d: %.2f\n", (k + 1), notas[i][j][k]);
                    }
                }
            }
        }
    }
}
