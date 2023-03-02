package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		
		int pesoKg, pesoG;
		double pesoGordo;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu peso em quilogramas: ");
		pesoKg = sc.nextInt();
		
		sc.close();
		
		pesoG = pesoKg * 1000;
		
		pesoGordo = pesoG + (pesoG * 0.12);
		
		System.out.println("Peso em Gramas: " + pesoG + " gramas");
		System.out.println("Peso em gramas com +12%: " + pesoGordo + " gramas");
		
		
	}
	
}
