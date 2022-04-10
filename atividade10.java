import java.util.Scanner;
public class atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número positivo: ");
        int x = entrada.nextInt();

        System.out.print("Digite o segundo número positivo: ");
        int y = entrada.nextInt();

        System.out.print("Digite o terceiro número positivo: ");
        int z = entrada.nextInt();

        System.out.print("Digite um número para saber qual média iremos fazer\n 1- Média Geométrica\n 2 - Média Ponderada\n 3 - Média Aritmética\n");
        int equacao = entrada.nextInt();

        if (x > 0 || y > 0 || z > 0){
            switch(equacao){
                case 1:
                    double geometrica = x*y*z;
                    System.out.println("O resultado desta equação geométrica é: " + geometrica);
                    break;
                case 2:
                    double ponderada = x + 2*y + 3*z*6;
                    System.out.println("O resultado desta equação ponderada é: " + ponderada);
                    break;
                case 3:
                    double aritmetica = x + y + z*3;
                    System.out.println("O resultado desta equação aritmética é: " + aritmetica);
                    break;
                default:
                    System.out.println("Erro. Digite uma equação válida");
            }
        } else{
            System.out.println("Erro. Escolha apenas números positivos");
        }
    }
}
