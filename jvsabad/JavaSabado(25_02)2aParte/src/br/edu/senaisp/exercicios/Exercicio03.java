package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		final double REAJSUTE = 0.01;
		double saldo, saldoReajustado;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		sc.close();
		
		saldoReajustado = (saldo + (saldo*REAJSUTE));

		System.out.println("Saldo anterior: R$ " + saldo);
		System.out.println("Saldo novo: R$ " +saldoReajustado);
		
	}
}
