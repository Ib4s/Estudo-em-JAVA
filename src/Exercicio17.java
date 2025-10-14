import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        System.out.print("Valor de A: ");
        int A = new Scanner(System.in).nextInt();

        System.out.print("Valor de B: ");
        int B = new Scanner(System.in).nextInt();

        System.out.print("Valor de C: ");
        int C = new Scanner(System.in).nextInt();

        System.out.print("Valor de D: ");
        int D = new Scanner(System.in).nextInt();

        int SOMA_AB = A+B;
        int MULT_AB = A*B;
        int SOMA_AC = A+C;
        int MULT_AC = A*C;
        int SOMA_AD = A+D;
        int MULT_AD = A*D;
        int SOMA_BC = B+C;
        int MULT_BC = B*C;
        int SOMA_BD = B+D;
        int MULT_BD = B*D;
        int SOMA_CD = C+D;
        int MULT_CD = C*D;

        System.out.println("Valor da soma de A e B: "+SOMA_AB);
        System.out.println("Valor da multiplicacao de A e B: "+MULT_AB);
        System.out.println("Valor da soma de A e C: "+SOMA_AC);
        System.out.println("Valor da multiplicacao de A e C: "+MULT_AC);
        System.out.println("Valor da soma de A e D: "+SOMA_AD);
        System.out.println("Valor da multiplicacao de A e D: "+MULT_AD);
        System.out.println("Valor da soma de B e C: "+SOMA_BC);
        System.out.println("Valor da multiplicacao de B e C: "+MULT_BC);
        System.out.println("Valor da soma de B e D: "+SOMA_BD);
        System.out.println("Valor da multiplicacao de B e D: "+MULT_BD);
        System.out.println("Valor da soma de C e D: "+SOMA_CD);
        System.out.println("Valor da multiplicacao de C e D: "+MULT_CD);
    }
}
