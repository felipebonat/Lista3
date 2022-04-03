import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        String operacao = " ";
        System.out.println("Informe a operação (+, -, * ou /): ");
        operacao = entrada.nextLine();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        if (operacao == "+") {
            double soma;
            soma = (n1 + n2); 
            System.out.print("A soma entre os dois termos é: " + soma + "\n");
        } else if (operacao == "-") {
            double subtracao;
            subtracao = (n1 - n2);
            System.out.print("A subtração entre os dois termos é: " + subtracao + "\n");
        } else if (operacao == "*") {
            double multiplicacao;
            multiplicacao = (n1 * n2);
            System.out.print("A multiplicação entre os dois termos é: " + multiplicacao + "\n");
        } else if (operacao == "/") {
            double divisao;
            divisao = (n1 / n2);
            System.out.print("A divisão entre os termos é: " + divisao + "\n");
        } else {
            System.out.print("Operação inválida.");
        }

    }
}
