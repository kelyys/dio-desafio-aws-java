import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String solicitacao = scanner.nextLine();

        String texto = solicitacao.toLowerCase();
        
        if (texto.contains("execut") || texto.contains("func")) {
           System.out.println("Lambda");
        
        } else if (texto.contains("armazen")) {
           System.out.println("S3");
        
        } else if (texto.contains("banco")) {
            System.out.println("RDS");
       
        } else if (texto.contains("servidor") || texto.contains("aplica")) {
            System.out.println("EC2");
       
        } else {
            System.out.println("Servico desconhecido");
        }

        scanner.close();
    }
}