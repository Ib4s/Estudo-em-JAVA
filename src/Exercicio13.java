import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){
        System.out.print("Temperatura em graus Fahrenheit: ");
        double F = new Scanner(System.in).nextDouble();

        double C = (F-32)*5/9;

        System.out.print("Temperatura em graus Celsius: "+C);
    }
}
