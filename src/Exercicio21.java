import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        System.out.print("Valor de A: ");
        int A = new Scanner(System.in).nextInt();

        System.out.print("Valor de B: ");
        int B = new Scanner(System.in).nextInt();

        int resultadoA = (A*A)+(A*A);
        int resultadoB = (B*B)+(B*B);

        System.out.println("A soma dos quadrados de A: "+resultadoA);
        System.out.println("A soma dos quadrados de B: "+resultadoB);
    }
}
