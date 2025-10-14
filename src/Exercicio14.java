import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        System.out.print("Raio da lata: ");
        double RAIO = new Scanner(System.in).nextInt();

        System.out.print("Altura da lata: ");
        double ALTURA = new Scanner(System.in).nextInt();

        double VOLUME = 3.14159*(RAIO*RAIO)*ALTURA;

        System.out.print("O volume da lata: "+VOLUME);

    }
}
