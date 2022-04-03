import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("----- Digite abaixo as informações do produto -----\n");
        
        String nome;
        System.out.print("Informe o nome: ");
        nome = entrada.nextLine();

        String modelo;
        System.out.print("informe o modelo: ");
        modelo = entrada.nextLine();

        System.out.print("Informe o tamanho: ");
        Float tamanho = entrada.nextFloat();

        System.out.print("Informe o preço: ");
        Double preco = entrada.nextDouble();

        System.out.print("Informe a quantidade: ");
        int quantidade = entrada.nextInt();

        System.out.print("----- Relatório sobre o produto -----\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("Modelo: " + modelo + "\n");
        System.out.print("Tamanho: " + tamanho + "\n");
        System.out.print("Preço: R$" + preco + "\n");
        System.out.print("Quantidade: " + quantidade + "\n");
    }
}