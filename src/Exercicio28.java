import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args){
        System.out.print("Digite um mumero de 3 algarismos: ");
        int N = new Scanner(System.in).nextInt();

        int C = N/100;
        int D = (N/10)%10;
        int U = N%10;

        int M = (U*100)+(D*10)+C;

        System.out.print("O numero inverso e: "+M);
    }
}
