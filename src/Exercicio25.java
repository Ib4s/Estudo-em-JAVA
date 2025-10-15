import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        System.out.print("Insira o dividendo: ");
        double int1 = new Scanner(System.in).nextDouble();

        System.out.print("Insira o divisor: ");
        double int2 = new Scanner(System.in).nextDouble();

        double QUOCIENTE = int1/int2;
        double RESTO = int1%int2;

        System.out.println("O quociente e: "+QUOCIENTE);
        System.out.println("O resto e: "+RESTO);
    }
}
