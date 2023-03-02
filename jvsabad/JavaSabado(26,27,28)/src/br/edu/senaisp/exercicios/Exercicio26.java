package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a base do triangulo: ");
		base = sc.nextDouble();
		
		System.out.println("Digite a altura do triangulo: ");
		altura = sc.nextDouble();
		
		sc.close();
		
		area = (base * altura) / 2;
		
		System.out.println("Area do triangulo: " + area);
		

	}

}
