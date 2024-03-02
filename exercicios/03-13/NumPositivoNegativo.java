import java.util.Scanner;

public class NumPositivoNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite um número para verificar ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado < 0) {
            System.out.println("O número que você digitou é negativo.");
        } else {
            System.out.println("O número que você digitou é positivo");
        }
    }
}
