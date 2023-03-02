package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		
		double prestacao, valor, taxa, tempo;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da prestacao: ");
		valor = sc.nextDouble();
		
		System.out.println("Digite a taxa de atraso da prestacao: ");
		taxa = sc.nextDouble();
		
		System.out.println("Digite o tempo de atraso da prestacao (em meses): ");
		tempo = sc.nextDouble();
		
		sc.close();
		
		prestacao = valor + (valor* (taxa/100) * tempo);
		
		System.out.println("Valor da prestacao: R$" + valor);
		System.out.println("Taxa de atraso: "+ taxa);
		System.out.println("Tempo de atraso: " + tempo + " meses");
		System.out.println("Valor da prestacao com atraso: " + prestacao);
	}

}
