import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args){
        System.out.print("Valor de A: ");
        int A = new Scanner(System.in).nextInt();

        System.out.print("Valor de B: ");
        int B = new Scanner(System.in).nextInt();

        int resultado = (A+B)*(A+B);

        System.out.print("O quadrado da soma dos valores lidos e: "+resultado);
    }
}
