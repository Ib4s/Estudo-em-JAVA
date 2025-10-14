import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args){
        System.out.print("Tempo da viagem(em horas): ");
        double TEMPO = new Scanner(System.in).nextDouble();

        System.out.print("Velocidade media do carro durante a viagem: ");
        double VELOCIDADE = new Scanner(System.in).nextDouble();

        double DISTANCIA = TEMPO * VELOCIDADE;
        double LITROS_USADOS = DISTANCIA / 12;

        System.out.println("Tempo da viagem(em horas): "+TEMPO);
        System.out.println("Velocidade media: "+VELOCIDADE);
        System.out.println("Distancia percorrida(em Km): "+DISTANCIA);
        System.out.println("Quantidade de litros utilizada na viagem: "+LITROS_USADOS);
    }
}
