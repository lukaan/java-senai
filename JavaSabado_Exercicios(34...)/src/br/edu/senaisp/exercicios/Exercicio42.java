package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio42 {

	public static void main(String[] args) {
		
		int horas, minutos, minutosFinal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite as horas: ");
		horas = sc.nextInt();
		
		System.out.println("Digite os minutos: ");
		minutos = sc.nextInt();
		
		sc.close();
		
		minutosFinal = (horas * 60) + minutos;
		
		System.out.println("Total Minutos: " +minutosFinal + " minutos");
	}
	
}
