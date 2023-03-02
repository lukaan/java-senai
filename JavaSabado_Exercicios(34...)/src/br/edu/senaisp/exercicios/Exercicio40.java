package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {

		double resultado, numerador, denominador; // nao sei se é quociente 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numerador da fracao: ");
		numerador = sc.nextDouble();
		
		System.out.println("Digite o denominador da fracao: ");
		denominador = sc.nextDouble();
		
		sc.close();
		
		resultado = numerador/denominador;
		
		System.out.printf("%.2f", resultado);

	}

}
