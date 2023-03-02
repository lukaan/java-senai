package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		double diagonalMaior, diagonalMenor, area;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a diagonal maior do losango: ");
		diagonalMaior = sc.nextDouble();
		
		System.out.println("Digite a diagonal menor do losango: ");
		diagonalMenor = sc.nextDouble();
		
		sc.close();
		
		area = (diagonalMaior * diagonalMenor) / 2;
		
		System.out.println("Area do losango: " + area);
		

	}

}