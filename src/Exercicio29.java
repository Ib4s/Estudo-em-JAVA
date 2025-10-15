import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args){
        System.out.print("Digite uma data no formado DDMMAA(dia/mes/ano): ");
        int DATA = new Scanner(System.in).nextInt();

        int DD = DATA/10000;
        int MM = (DATA/100)%100;
        int AA = DATA%100;

        int AAMMDD = (AA*10000)+(MM*100)+DD;

        System.out.print("A data no formato AAMMDD e: "+AAMMDD);
    }
}
