package br.edu.senaisp.exercicios;

import java.util.Scanner; 

public class Exercicio47 {

	public static void main (String[] args) {
		
		int sucessor, input;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		input = sc.nextInt();
		
		sc.close();
		
		sucessor = (input+1) % 61;
		
		System.out.println("Sucessor: " + sucessor);
		
	}
	
}
