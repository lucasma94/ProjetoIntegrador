package ProjetoIntregador;

import java.util.Scanner;

public class FormulaDeBaskara {
    public static void main (String [] args){
    
    Scanner leitor = new Scanner (System.in);
    
    //Entrada
    System.out.print("x1: ");
    double x1 = leitor.nextDouble();
    System.out.print("x2: ");
    double x2 = leitor.nextDouble();
    System.out.print("c: ");
    double c = leitor.nextDouble();
    
    //Processamento
    double s = x1 + x2;
    double p = x1 * x2;
    double a = c / p;
    double b = -(a * s);
    
    //Saída
    System.out.println(" a"
            + " x² + "
            + b            
            + "x +"
            + c
            + " = 0 ");
}
    
    }