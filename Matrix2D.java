import java.util.Scanner;

public class Matrix2D {
    static Scanner input = new Scanner(System.in);
    static float[][] aluno = new float[3][3];

    public static void main(String[] args) {
        System.out.println("***********");

        for (int i = 0; i < 3; i ++) {
            System.out.println("Aluno " + (i+1) + ":");

            for (int j = 0; j < 3; j ++) {
                System.out.println("Nota " + (j+1) + ": ");
                aluno[i][j] = input.nextFloat();
            }
        }

        for (int i = 0; i < 3; i ++) {
            System.out.println("Aluno " + (i+1) + ": ");

            for (int j = 0; j < 3; j ++) {
                System.out.println(aluno[i][j]);
            }
        }
    }
}
