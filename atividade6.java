import java.util.Scanner;
public class atividade6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu sexo (H - Homem, M - Mulher): ");
        char sexo = entrada.next().charAt(0);

        System.out.print("Digite a sua altura: ");
        double h = entrada.nextDouble();

        if (sexo == 'H' || sexo == 'h') {
            double idealH = (72.2 * h) - 58;
            System.out.println("O seu peso ideal é igual à " + idealH);
        }else if (sexo == 'M' || sexo == 'm') {
            double idealM = (62.1 * h) - 44.7;
            System.out.println("O seu peso ideal é igual à " + idealM);
        }
    }
}
