import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args){
        System.out.print("Valor 1: ");
        double VAL1 = new Scanner(System.in).nextDouble();

        System.out.print("Valor 2: ");
        double VLA2 = new Scanner(System.in).nextDouble();

        double MEDIA = (VAL1+VLA2)/2;

        System.out.print("Media dos valores: "+MEDIA);
    }
}
