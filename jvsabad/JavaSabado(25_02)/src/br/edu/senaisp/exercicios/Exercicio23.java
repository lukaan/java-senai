package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		double raio, perimetro, area;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o raio do círculo: ");
		raio = sc.nextDouble();
		
		sc.close();
		
		perimetro = (2*Math.PI*raio);
		area = (Math.PI * Math.pow(raio, 2) );
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	
	}
}
