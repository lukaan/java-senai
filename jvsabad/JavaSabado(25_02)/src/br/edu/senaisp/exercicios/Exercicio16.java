package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double numero;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira um numero: ");
		numero = sc.nextDouble();
		
		sc.close();
		
		System.out.println("O logaritmo na base 10 é de: " + Math.log10(numero));
		
	}
}

//Entrar com um número e imprimir o logaritmo desse número na base 10.