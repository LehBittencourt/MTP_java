package exercicio5;
//@author leticia

import java.util.Scanner;
import model.Aluno;

public class Exercicio5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Aluno aluno[] = new Aluno[5];
        
        for (int i=0;i<5;i++) {
            aluno[i] = new Aluno();
        
            System.out.println("\nDigite os dados do " + (i + 1) + " aluno: ");
            System.out.print("Matricula: ");
            aluno[i].matricula = sc.nextInt();
            
            System.out.print("Nome: ");
            sc.nextLine();
            aluno[i].nome = sc.nextLine();
            
            System.out.print("Primeira nota: ");
            aluno[i].nota1 = sc.nextDouble();
            
            System.out.print("Segunda nota: ");
            aluno[i].nota2 = sc.nextDouble();
            
            System.out.print("Terceira nota: ");
            aluno[i].nota3 = sc.nextDouble();
        }
        
        Aluno maior_nota1 = aluno[0];
        Aluno maior_media = aluno[0];
        Aluno menor_media = aluno[0];
        
        for (int i=1;i<5;i++) {
            if (aluno[i].nota1 > maior_nota1.nota1) {
                maior_nota1 = aluno[i];
            }
            
            double media = (aluno[i].nota1 + aluno[i].nota2 + aluno[i].nota3) / 3.0;
            double mediaMaior = (maior_media.nota1 + maior_media.nota2 + maior_media.nota3) / 3.0;
            double mediaMenor = (menor_media.nota1 + menor_media.nota2 + menor_media.nota3) / 3.0;
            
            if (media > mediaMaior) {
                maior_media = aluno[i];
            }
            
            if (media < mediaMenor) {
                menor_media = aluno[i];
            }
        }
        
        System.out.println("\nAluno com maior nota na primeira prova:");
        System.out.println("Matrícula: " + maior_nota1.matricula);
        System.out.println("Nome: " + maior_nota1.nome);
        System.out.println("Nota da primeira prova: " + maior_nota1.nota1);
        
        System.out.println("\nAluno com maior média geral:");
        System.out.println("Matrícula: " + maior_media.matricula);
        System.out.println("Nome: " + maior_media.nome);
        System.out.println("Média: " + ((maior_media.nota1 + maior_media.nota2 + maior_media.nota3) / 3.0));
        
        System.out.println("\nAluno com menor média geral:");
        System.out.println("Matrícula: " + menor_media.matricula);
        System.out.println("Nome: " + menor_media.nome);
        System.out.println("Média: " + ((menor_media.nota1 + menor_media.nota2 + menor_media.nota3) / 3.0));
        
        System.out.println("\nSituação de cada aluno:");
        for (Aluno a : aluno) {
            double media = (a.nota1 + a.nota2 + a.nota3) / 3.0;
            System.out.print("Aluno " + a.matricula + " - " + a.nome + ": ");
            if (media >= 7.0) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}



