import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        System.out.print("A base do triangulo e: ");
        double BASE = new Scanner(System.in).nextInt();

        System.out.print("A altura do triangulo e: ");
        double ALTURA = new Scanner(System.in).nextInt();

        double AREA = (BASE*ALTURA)/2;

        System.out.print("A area do triangulo e: "+AREA);
    }
}
