package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		double temperaturaF, temperaturaC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		temperaturaC = sc.nextDouble();
		
		sc.close();
		
		temperaturaF = 9*temperaturaC+160/5;
		
		System.out.println("Temperatura Celsius: " + temperaturaC);
		System.out.println("Temperatura Fahrenheit: " + temperaturaF);
		
		
	}
	
}
