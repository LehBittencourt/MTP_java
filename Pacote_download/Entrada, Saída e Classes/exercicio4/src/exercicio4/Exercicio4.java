package exercicio4;
//@author leticia

import java.util.Scanner;
import model.Cadastro; 

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cadastro cadastro[] = new Cadastro[3];
    
        for (int i=0;i<3;i++){
            cadastro[i] = new Cadastro();
        
            System.out.println("\nCadastro do computador " + (i + 1) + ":");
            System.out.print("Marca: ");
            cadastro[i].marca = sc.next();
        
            System.out.print("Ano de Fabricacao: ");
            cadastro[i].ano_fabricacao = sc.nextInt();
        
            System.out.print("Peso: ");
            cadastro[i].peso = sc.nextDouble();
        }    
    
        for (int i=0;i<3;i++){
            System.out.println("\n\nComputador " + (i + 1) + ":");
            System.out.println("Marca: " + cadastro[i].marca);
            System.out.println("Ano de Fabricacao: " + cadastro[i].ano_fabricacao);
            System.out.println("Peso: " + cadastro[i].peso);
        }
    }
}