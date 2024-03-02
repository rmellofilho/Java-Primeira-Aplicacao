import java.util.Random;
import java.util.Scanner;


public class Advinhacao {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int tentativas = 0;
        int tentativa = -1;


        while (tentativas < 5) {
            System.out.println("Você tem " + (5 - tentativas) + " tentativas");
            tentativas++;
            System.out.println("Digite um número de 0 a 100 para adivinhar:");
            tentativa = leitura.nextInt();

            if (tentativa != numeroAleatorio) {
                if (tentativa < numeroAleatorio) {
                    System.out.println("O número que você digitou é menor que o número da adivinhação.");
                } else {
                    System.out.println("O número que você digitou é maior que o número da adivinhação.");
                }
            } else {
                System.out.println("Parabéns você acertou!");
                break;
            }
            
        }
     
        System.out.println("O número da advinhação foi o " + numeroAleatorio);
    }
}
