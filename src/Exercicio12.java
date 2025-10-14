import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        System.out.print("Temperatura em graus Celsius: ");
        double C = new Scanner(System.in).nextDouble();

        double F = (9*C+160)/5;

        System.out.print("Temperatura em graus Fahrenheit: "+F);
    }
}
