import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args){
        System.out.print("Salario bruto: ");
        double SALARIO_BRUTO = new Scanner(System.in).nextDouble();

        double DESCONTO_PREVIDENCIA = SALARIO_BRUTO*90/100;
        double SALARIO_LIQUIDO = DESCONTO_PREVIDENCIA*95/100;

        System.out.print("O salario liquido e: "+SALARIO_LIQUIDO);
    }
}
