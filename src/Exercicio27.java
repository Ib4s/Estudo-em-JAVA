import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args){
        System.out.print("Digite um codigo de 5 algarismos: ");
        int CODIGO = new Scanner(System.in).nextInt();

        int A = CODIGO/10000;
        int B = (CODIGO/1000) % 10;
        int C = (CODIGO/100) % 10;
        int D = (CODIGO/10) % 10;
        int E = CODIGO%10;

        int S = (6*A)+(5*B)+(4*C)+(3*D)+(2*E);

        int DIGITOV = S%7;

        System.out.print("O codigo verificador e: "+DIGITOV);
    }
}
