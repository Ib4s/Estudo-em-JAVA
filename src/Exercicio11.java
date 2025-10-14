import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        System.out.print("Horas trabalhadas no mes: ");
        int HT = new Scanner(System.in).nextInt();

        System.out.print("Valor hora trabalhada: ");
        int VH = new Scanner(System.in).nextInt();

        System.out.print("Percentual de desconto: ");
        double PD = new Scanner(System.in).nextDouble();

        double SB = HT*VH;
        double TD = (PD/100)*SB;
        double SL = SB - TD;

        System.out.println("Horas trabalhadas: "+HT);
        System.out.println("Salario Bruto: "+SB);
        System.out.println("Desconto: "+TD);
        System.out.println("Salario Liquido: "+SL);
    }
}
