import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){
        System.out.print("Velocidade(em Km/h): ");
        double KM = new Scanner(System.in).nextDouble();

        double MS = KM/3.6;

        System.out.print("Velocidade(em m/s): "+MS);
    }
}
