package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {

		int prova1, prova2, mediaTruncada;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da prova 1: ");
		prova1 = sc.nextInt();
		
		System.out.println("Digite a nota da prova 2: ");
		prova2 = sc.nextInt();
		
		sc.close();
		
		media = (prova1 + prova2) / 2;
		mediaTruncada = (prova1 + prova2) / 2;
		
		System.out.println("Media Truncada: " + mediaTruncada);
		System.out.println("Media: " + media);
		
		
	}
}
