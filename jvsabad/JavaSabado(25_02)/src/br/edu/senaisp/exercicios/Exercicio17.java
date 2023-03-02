package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		double logaritmo, logaritmando, base;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu logaritmo: ");
		logaritmo = sc.nextDouble();
		
		System.out.println("Digite a base: ");
		base = sc.nextDouble();
		
		sc.close();

		logaritmando = (Math.log(logaritmo)/Math.log(base));
		
		System.out.println("Resultado: " + logaritmando);
	}

}
//Entrar com o número e a base em que se deseja calcular o logaritmo desse
//número e imprimi-lo.