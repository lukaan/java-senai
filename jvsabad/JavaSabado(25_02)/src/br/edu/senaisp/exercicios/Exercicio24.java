package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		double lado, perimetro, area, diagonal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		lado = sc.nextDouble();
		
		sc.close();
		
		area = Math.pow(lado, 2);
		
		perimetro = (lado*4);
		
		diagonal = Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
		
		System.out.println("Area: " + area);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Diagonal: " + diagonal);
	}


}
