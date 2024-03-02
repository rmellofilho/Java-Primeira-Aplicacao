public class ManipulandoVariaveis {

    public static void main(String[] args) {

        System.out.println("""
           
        1. Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        Resultado:""");
        int primeiraNota = 5;
        int segundaNota = 7;
        int media = (primeiraNota + segundaNota) / 2;
        System.out.println("A média das duas notas é " + media);

        System.out.println("""
           
        2. Declare uma variável do tipo double e uma variável do tipo int.
        Faça o casting da variável double para int e imprima o resultado.
        Resultado:""");
        double variavelDouble = 10.5;
        int variavelInt = (int) variavelDouble;
        System.out.println("O casting da variável double para o int resultou em " + variavelInt);

        System.out.println("""
           
        3. Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.
        Resultado:""");
        char variavelChar = 'M';
        String variavelString = "ensagem";
        System.out.println(variavelChar + variavelString); 

        System.out.println("""

        4.Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        Resultado:""");
        double precoProduto = 7.0;
        int quantidade = 7;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Preço do produto: " + precoProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: " + valorTotal); 

        System.out.println("""

        5. Declare uma variável do tipo double valorEmDolares.
        Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
        Resultado:""");
        double valorEmDolares = 5.5;
        double valorDoDolar = 4.94;
        double valorEmReal = valorEmDolares * valorDoDolar;
        System.out.println("O valor em dolar $5.5 em real é R$" + valorEmReal);

        System.out.println("""

        6. Declare uma variável do tipo double precoOriginal.
        Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        Resultado:""");
        double precoOriginal = 10;
        double percentualDesconto = 10.0;
        double precoComDesconto = precoOriginal * (1 - (percentualDesconto / 100));
        System.out.println("O preço original é R$" + precoOriginal);
        System.out.println("O desconto foi de " + percentualDesconto + "%");
        System.out.println("Preço final com desconto R$" + precoComDesconto);
    }

}