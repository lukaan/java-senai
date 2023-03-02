package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {

		//Calcular o volume de um cilindro
		
		double raio, altura, volume;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio da lata (em centimetros): ");
		raio = sc.nextDouble();
		
		System.out.println("Digite a altura da lata (em centimetros): ");
		altura = sc.nextDouble();
		
		sc.close();
		
		volume = (3.14159 * Math.pow(raio, 2) * altura);
		
		System.out.println("O volume da lata é: " + volume + " cm³");
		
		
	}                          
	
}
