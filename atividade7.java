import java.util.Scanner;
public class atividade7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o valor do produto: R$");
        double valorInicial = entrada.nextDouble();

        String estado;
        System.out.print("Para qual estado deseja importar o produto: ");
        estado = entrada.next();

        switch(estado) {
            case "MG":
                double valorFinalMG1 = valorInicial/100 * 7;
                double valorFinalMG = valorFinalMG1 + valorInicial;
                System.out.println("Importando para Minas Gerais, o valor final sera: R$" + valorFinalMG); 
                break;
            case "SP":
                double valorFinalSP1 = valorInicial/100 * 12;
                double valorFinalSP = valorFinalSP1 + valorInicial;
                System.out.println("Importando para São Paulo, o valor final sera: R$" + valorFinalSP); 
                break;
            case "RJ":
                double valorFinalRJ1 = valorInicial/100 * 15;
                double valorFinalRJ = valorFinalRJ1 + valorInicial;
                System.out.println("Importando para Rio de Janeiro, o valor final sera: R$" + valorFinalRJ);
                break;
            case "MS":
                double valorFinalMS1 = valorInicial/100 * 8;
                double valorFinalMS = valorFinalMS1 + valorInicial;
                System.out.println("Importando para Mato Grosso do Sul, o valor final sera: R$" + valorFinalMS);
                break;
            default:
                System.out.println("Erro. Sem informações para o estado informado.");
            
        }    
    }   
}
