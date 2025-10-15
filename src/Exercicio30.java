import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args){
        System.out.print("Digite a matricula no formado AASDDD(ano/semestre/ordem): ");
        int MATRICULA = new Scanner(System.in).nextInt();

        int AA = MATRICULA/10000;
        int S = (MATRICULA/1000)%10;

        System.out.println("Ano em que o aluno foi matriculado: 20"+AA);
        System.out.println("Semestre em que o aluno foi matriculado: "+S);
    }
}
