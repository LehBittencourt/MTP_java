package exercicio6;
//@author leticia

import java.util.Scanner;
import model.Cadastro;
import model.Endereco;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cadastro cadastro[] = new Cadastro[7];
        Endereco endereco[] = new Endereco[7];

        for(int i = 0; i < 7; i++){
            cadastro[i] = new Cadastro();
            endereco[i] = new Endereco();

            System.out.println("\nDigite os dados da " + (i+1) + " pessoa: ");
            System.out.print("Nome: ");
            cadastro[i].nome = sc.nextLine();

            System.out.print("Identidade: ");
            cadastro[i].identidade = sc.nextInt();

            System.out.print("Telefone: ");
            cadastro[i].telefone = sc.nextInt();

            System.out.print("Idade: ");
            cadastro[i].idade = sc.nextInt();

            System.out.print("Salario: ");
            cadastro[i].salario = sc.nextDouble();
            sc.nextLine();

            System.out.print("Estado civil: ");
            cadastro[i].estado_civil = sc.nextLine();

            System.out.print("Sexo: ");
            cadastro[i].sexo = sc.nextLine();

            System.out.println("Endereco: ");
            System.out.print("Rua: ");
            endereco[i].rua = sc.nextLine();

            System.out.print("Bairro: ");
            endereco[i].bairro = sc.nextLine();

            System.out.print("Cidade: ");
            endereco[i].cidade = sc.nextLine();

            System.out.print("Estado: ");
            endereco[i].estado = sc.nextLine();

            System.out.print("CEP: ");
            endereco[i].CEP = sc.nextInt();
            sc.nextLine();
        }

        int maior = -1;
        int maior_idade = -1;
        
        for (int i = 0; i < 7; i++) {
            if (cadastro[i].idade > maior) {
                maior = cadastro[i].idade;
                maior_idade = i;
            }
        }
        System.out.println("A pessoa com a maior idade e: " + cadastro[maior_idade].nome);

        System.out.println("Pessoas do sexo masculino:");
        for (int i=0;i<7;i++){
            if (cadastro[i].sexo.equalsIgnoreCase("masculino")) {
                System.out.println(cadastro[i].nome);
            }
        }

        System.out.println("Pessoas com salario maior que 1000: ");
        for (int i=0;i<7;i++) {
            if (cadastro[i].salario > 1000){
                System.out.println(cadastro[i].nome);
            }
        }

        System.out.print("Digite a identidade para buscar: ");
        int identidade = sc.nextInt();
        
        for (int i=0;i<7;i++) {
            if (cadastro[i].identidade == identidade) {
                System.out.println("Dados da pessoa com identidade " + identidade + ":");
                System.out.println("Nome: " + cadastro[i].nome);
                System.out.println("Telefone: " + cadastro[i].telefone);
            }
        }
    }
}

