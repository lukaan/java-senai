package br.edu.senaisp.exercicios;
import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		double prova1, prova2, trabalho, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da sua prova 1: ");
		prova1 = sc.nextDouble();
		
		System.out.println("Digite a nota da sua prova 2: ");
		prova2 = sc.nextDouble();
		
		System.out.println("Digite a nota do seu trabalho: ");
		trabalho = sc.nextDouble();
		
		media = ((prova1 + prova2 + trabalho) / 3);
		
		sc.close();
		if (media >= 6) {
			System.out.println("Aprovado! Sua média é de: " + media);
		} else {
			System.out.println("Reprovado! Sua média é de: " +media);
		}
			
	}
}


 /* Usando a classe Scanner para entrada de dados, elabore uma classe que receba a
nota de duas provas e de um trabalho. Calcule e mostre a média e o resultado final
(aprovado ou reprovado). Para calcular a média utilize a fórmula seguinte: média =
(nota da prova 1 + nota da prova 2 +nota do trabalho) / 3. Considere que a média
mínima para aprovação é 6.
*/
