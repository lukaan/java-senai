package br.edu.senaisp.exercicios;

import java.util.Scanner; 

public class Exercicio39 {

	public static void main(String[] args) {
		
		String variavelA, variavelB, variavelTemp;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a variavel A: ");
		variavelA = sc.nextLine();
		
		System.out.println("Digite a variavel B");
		variavelB = sc.nextLine();
		
		sc.close();
		
		variavelTemp = variavelA;
		variavelA = variavelB;
		variavelB = variavelTemp;

		
		System.out.println("Variavel A: " + variavelA);
		System.out.println("Variavel B: " + variavelB);
		
		
		
	}
	
}
