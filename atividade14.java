import java.util.Scanner;

public class atividade14 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o coeficiente a: ");
        double coeA = entrada.nextDouble();

        System.out.print("Digite o coeficiente b: ");
        double coeB = entrada.nextDouble();

        System.out.print("Digite o coeficiente c: ");
        double coeC = entrada.nextDouble();

        double delta = (coeB*coeB - 4 * coeA *coeC);

        double x11 = (-coeB + Math.sqrt(delta));
        double x1 = x11  / (2 * coeA);

        double x22 = (-coeB - Math.sqrt(delta));
        double x2 = x22 / (2 * coeA);

        if(delta < 0){
            System.out.println("Não existe raiz.");

        }else if(delta == 0){
            System.out.print("Raiz única.");
            System.out.println("Raiz = " + x1 );

        }else if(delta > 0){
            System.out.print("Existem duas raízes reais. ");
            System.out.println("Raízes: x1 = " + x1 + " x2 = " + x2);
        }
    }
}