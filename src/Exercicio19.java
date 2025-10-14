import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
        System.out.print("Lado do quadrado ou cubo: ");
        int LADO = new Scanner(System.in).nextInt();

        int QUADRADO = LADO*LADO;
        int CUBO = LADO*LADO*LADO;

        System.out.println("O quadrado tem: "+QUADRADO+"cm^2");
        System.out.println("O cubo tem: "+CUBO+"cm^3");
    }
}
