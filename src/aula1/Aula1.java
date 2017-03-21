package aula1;

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        float n1, n2, media;
        float P1, P2;
        // atribuição ou inicialização
        P1 = 0.4f;
        P2 = 0.6f;
        System.out.println("Calculo da Média");
        System.out.println("Nota 1: ");
        n1 = leitor.nextFloat();
        System.out.println("Nota 2: ");
        n2 = leitor.nextFloat();
        media = (n1 * P1) + (n2 * P2);
        System.out.println("media " + media);
        System.out.printf("Nota 1: %,2f \n Nota 2: %,2f \n Média: %,4f \n", n1, n2, media);
    }

}
