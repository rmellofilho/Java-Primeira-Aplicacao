import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String menu = """
                Opções de cálculo:
                1. Calcular área do quadrado;
                2. Calcular área do círculo.
                """;
        System.out.println(menu);

        System.out.println("Selecione uma opção para calcular:");        
        int opcaoSelecionada = leitura.nextInt();
        
        switch (opcaoSelecionada) {
            case 1:
                System.out.println("Informe a base:");
                int base = leitura.nextInt();
                System.out.println("Informe a altura:");
                int altura = leitura.nextInt();
                int resultadoArea = base * altura;

                System.out.println("Sua área do quadrado é " + resultadoArea);
                break;

            case 2:
                System.out.println("Informe o raio: ");
                int raio = leitura.nextInt();
                double resultadoCirculo = Math.PI * raio * raio;
                
                System.out.println("Sua área do quadrado é " + resultadoCirculo);
                break;
            
            default:
                System.out.println("Opção inválida!");
                break;            
        }
        
       
    }
}
