package exercicio3;
//@author leticia

import java.util.Scanner;
import model.Pessoa;
import model.Endereço;
import model.DataNascimento;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Endereço endereço = new Endereço();
        DataNascimento data_nascimento = new DataNascimento();
        
        System.out.println("Cadastro");
        System.out.print("Nome: ");
        pessoa.nome = sc.nextLine();
        
        System.out.print("Sexo: ");
        pessoa.sexo = sc.next();
        
        System.out.print("Peso: ");
        pessoa.peso = sc.nextDouble();
        
        System.out.print("Nome da rua: ");
        sc.nextLine();
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
        
        System.out.print("Dia do seu nascimento: ");
        data_nascimento.dia = sc.nextInt();
        
        System.out.print("Mes do seu nasmineto: ");
        data_nascimento.mes = sc.nextInt();
        
        System.out.print("Ano do seu nascimento: ");
        data_nascimento.ano = sc.nextInt();
        
        System.out.println("\n\nNome: " + pessoa.nome + "\nSexo: " + pessoa.sexo+ "\nPeso: " + pessoa.peso);
        System.out.println("Data de nascimento: " + data_nascimento.dia + "/" + data_nascimento.mes + "/" + data_nascimento.ano);
        System.out.println("Endereco: nome da rua: " + endereço.nome_rua + ", numero: " + endereço.numero + ", cidade: " + endereço.cidade + ", estado: " + endereço.estado + ", CEP: " + endereço.CEP + ".");
        
    }
    
}
