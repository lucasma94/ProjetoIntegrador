
package ProjetoIntregador;

import java.util.Scanner;

public class Saudacao {
    public static void main (String [] args){
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        
        if (nome.equals ("")){
            System.out.println("Olá mundo!");
                    } else {
            System.out.println("Olá, " + nome + "!");
    }
       
        
        
    }
}
