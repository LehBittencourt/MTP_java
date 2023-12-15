package exercicio1;
//@author leticia

import java.util.Scanner;
import model.Hora;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Hora hora = new Hora();
        
        do{
        System.out.print("Digite as horas: ");
        hora.horas = sc.nextInt();
            if(hora.horas<0 || hora.horas>23){
                System.out.println("Digite uma numero valido!");
            }
        } while(hora.horas<0 || hora.horas>23);
        
        do{
        System.out.print("Digite os minutos: ");
        hora.minutos = sc.nextInt();
            if(hora.minutos<0 || hora.minutos>59){
                System.out.println("Digite um numero invalido!");
            }
        } while(hora.minutos<0 || hora.minutos>59);
        
        do{
        System.out.print("Digite os segundos: ");
        hora.segundos = sc.nextInt();
            if(hora.segundos<0 || hora.segundos>59){
                System.out.println("Digite um numero invalido!");
            }
        } while(hora.segundos<0 || hora.segundos>59); 
        
        System.out.println("Horas " + hora.horas + ":" + hora.minutos + ":" + hora.segundos);
    }
    
}
