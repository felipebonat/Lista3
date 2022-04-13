import java.util.Scanner;
public class atividade13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número para saber se é divisível por 3 ou por 5: ");
        double num1 = entrada.nextDouble();

        boolean div3 = num1 % 3 == 0;
        boolean div5 = num1 % 5 == 0;

        if ((div3) && (!div5)){
            System.out.println(num1 + " é divisível por 3.");
        }else if ((div5) && (!div3)){
            System.out.println(num1 + " é divisível por 5.");
        }else{
            System.out.println("Esse número pode não ser divisível por 3 ou 5.\nOu, o mesmo pode ser divisível por ambos ao mesmo tempo.");
        }
    }
}
