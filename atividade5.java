import java.util.Scanner;
public class atividade5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n1 = entrada.nextDouble();

        if (n1 > 0){
            double quadrado;
            quadrado = n1 * n1;
            double raiz = Math.sqrt(n1);
            System.out.println(n1 + " ao quadrado é igual à: " + quadrado);
            System.out.println("E a raiz de " + n1 + " é igual à: " + raiz);
        }else {
            System.out.println("O programa funciona para números positivos.");
        }
    }
}
