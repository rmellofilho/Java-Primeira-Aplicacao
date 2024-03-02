import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = leitura.nextInt();

        System.out.println("Agora digite o segundo número para comparar: ");
        int segundoNumero = leitura.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os número são iguais!");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Os números diferentes, pois o primeiro número é maior do que o segundo!");
        } else {
            System.out.println("Os números diferentes, pois o segundo número é maior do que o primeiro!");
        }
    }
}
