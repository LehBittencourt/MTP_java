package exercicio2;
//@author leticia

import java.util.Scanner;
import model.Endereço;

public class Exercicio2 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Endereço endereço = new Endereço();
        
        System.out.println("Digite o endereco: ");
        
        System.out.print("Nome da rua: ");
        endereço.nome_rua = sc.nextLine();
        
        System.out.print("Numero: ");
        endereço.numero = sc.nextInt();
        
        System.out.print("Cidade: ");
        sc.nextLine();
        endereço.cidade = sc.nextLine();

        System.out.print("Estado: ");
        endereço.estado = sc.nextLine();
        
        System.out.print("CEP: ");
        endereço.CEP = sc.nextInt();
        
        System.out.println("Endereco: nome da rua: " + endereço.nome_rua + ", numero: " + endereço.numero + ", cidade: " + endereço.cidade + ", estado: " + endereço.estado + ", CEP: " + endereço.CEP + ".");
        
        
        
        
    }
    
}
