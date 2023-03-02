package br.edu.senaisp.exercicios;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int pontosLider, pontosLanterna, qtdVitorias; 
		// 1 vitória = 3 pontos
	
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a pontuação total do time Líder: ");
		pontosLider = sc.nextInt();
		
		System.out.println("Digite a pontuação total do time Lanterna: ");
		pontosLanterna = sc.nextInt();
		
		qtdVitorias = ((pontosLider - pontosLanterna) / 3) + 1;
		
		System.out.println("A quantidade de vitórias necessárias é de: " + qtdVitorias);
		
		sc.close();
		
		
		
	}

}

/* 
 * Usando a classe Scanner para entrada de dados, faça uma classe que receba dois
valores inteiros.O primeiro valor corresponde à quantidade de pontos do líder do
campeonato brasileiro de futebol. O segundo valor corresponde à quantidade de
pontos do time lanterna. Considerando que cada vitória vale 3 pontos, elabore uma
classe que calcule o número de vitórias necessárias para que o time lanterna alcance
(ou ultrapasse) o líder. Por exemplo, supondo que as quantidades de ponto fornecidas
sejam 40 e 22, então o número de vitórias apresentada na saída deverá ser 6, pois
(40-22) / 3 = 6.
 * 
 */
