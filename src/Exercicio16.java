import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
        System.out.print("Valor de A: ");
        int A = new Scanner(System.in).nextInt();

        System.out.print("Valor de B: ");
        int B = new Scanner(System.in).nextInt();

        int troca = A;
        A = B;
        B = troca;

        System.out.println("Valor de A depois da troca: "+ A);
        System.out.println("Valor de B depois da troca: "+ B);
    }
}
