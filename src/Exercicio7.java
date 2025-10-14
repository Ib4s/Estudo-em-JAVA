import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args){
        System.out.print("Raio da circunferencia e: ");
        double RAIO = new Scanner(System.in).nextDouble();

        final double PI = 3.14159;
        double AREA = PI*(RAIO*RAIO);

        System.out.println("Area da circunferencia e: "+AREA);
    }
}
