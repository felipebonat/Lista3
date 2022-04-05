import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o seu salário: ");
        double salario = entrada.nextDouble();

        System.out.print("Informe a prestação do emprestimo: ");
        double prestacao = entrada.nextDouble();

        double porcentagem;
        porcentagem = salario/100 * 20;

        if (prestacao > porcentagem){
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo concedido.");
        }
    }
}
