import java.util.Scanner;

public class atividade3 { 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println(" --- Irei lhe informar qual número é maior ---");

        System.out.print("Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = entrada.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        }else if (n1 < n2){
            System.out.println(n2 + " é maior que " + n1);
        }else{
            System.out.println("Números iguais.");
        }
    }    
}
