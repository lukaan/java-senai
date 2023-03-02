package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio48 {

	public static void main(String[] args) {
		
		double numero1, numero2, quadradoDiferenca, diferencaDosQuadrados, diferenca;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero 1: ");
		numero1 = sc.nextDouble();
		
		System.out.println("Digite o numero 2: ");
		numero2 = sc.nextDouble();
		
		sc.close();
		//Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo
		//segundo e a diferença dos quadrados.
		diferenca = numero1 - numero2;
		quadradoDiferenca = Math.pow(diferenca, 2);
		
		diferencaDosQuadrados = Math.pow(numero1, 2) - Math.pow(numero2, 2);
		
		System.out.println("Quadrado da diferença dos dois valores: " + quadradoDiferenca);
		System.out.println("Diferença dos dois quadrados: " + diferencaDosQuadrados);
		
		
	}
	
}
