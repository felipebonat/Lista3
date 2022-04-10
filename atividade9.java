import java.util.Scanner;
public class atividade9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Informe o seu peso: ");
        double peso = entrada.nextDouble();

        if (altura < 1.20){
            if (peso <= 60){
                System.out.println("Sua classificação é A.");
            }else if (peso > 60 && peso <= 90){
                System.out.println("Sua classificação é D.");
            }else{
                System.out.println("Sua classificação é G.");
            }
        }else if (altura >= 1.20 && altura < 1.70){
            if (peso <= 60){
                System.out.println("Sua classificação é B.");
            }else if (peso > 60 && peso <= 90){
                System.out.println("Sua classificação é E.");
            }else{
                System.out.println("Sua classificação é H.");
            }
        }else if (altura >= 1.70){
            if (peso <= 60){
                System.out.println("Sua classificação é D.");
            }else if (peso > 60 && peso <= 90){
                System.out.println("Sua classificação é F.");
            }else{
                System.out.println("Sua classificação é H.");
            }
        }
    }
}
