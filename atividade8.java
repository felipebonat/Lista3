import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade = entrada.nextInt();

        if ((idade == 5) || (idade == 6) || (idade == 7)){
            System.out.println("Categoria Infantil A.");
        }else if ((idade == 8) || (idade == 9) || (idade == 10)){
            System.out.println("Categoria Infantil B.");
        }else if ((idade == 11) || (idade == 12) || (idade == 13)){
            System.out.println("Categotia Juvenil A.");
        }else if ((idade == 14) || (idade == 15) || (idade == 16) || (idade == 17)){
            System.out.println("Categoria Juvenil B.");
        }else if (idade >= 18){
            System.out.println("Categoria Sênior.");
        }
    }
}
