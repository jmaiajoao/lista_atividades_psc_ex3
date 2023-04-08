
// programa de soluções computacionais.
// Lista 2 ( atividade 3)
//Aluno: João Victor Maia Leite
//RA: 323124931




import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
       // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

       // entrada de dados 

    Scanner input = new Scanner(System.in);

    System.out.println("O raio do circulo será");
    int raio = input.nextInt();

    // calcular área 

  Double pi = 3.14;
  
  System.out.println("O valor da área será " + pi * raio * raio );

    }

}
  


    