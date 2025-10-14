import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        System.out.print("O comprimento do retangulo e: ");
        int COMPRIMENTO = new Scanner(System.in).nextInt();

        System.out.print("A largura do retangulo e: ");
        int LARGURA = new Scanner(System.in).nextInt();

        System.out.print("A altura do retangulo e: ");
        int ALTURA = new Scanner(System.in).nextInt();

        int VOLUME = COMPRIMENTO * LARGURA * ALTURA;

        System.out.print("O volume do retangulo e: "+VOLUME);
    }
}
