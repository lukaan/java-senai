package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		double salarioMinimoUsuario, salarioUsuario, qtdSalarioMinimoUsuario, qtdSalarioMinimoFixo, salarioMinimoFixo;

		salarioMinimoFixo = 788.00;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salario minimo: ");
		salarioMinimoUsuario = sc.nextDouble();

		System.out.println("Digite o seu salario: ");
		salarioUsuario = sc.nextDouble();

		sc.close();

		qtdSalarioMinimoUsuario = salarioUsuario / salarioMinimoUsuario;

		qtdSalarioMinimoFixo = salarioUsuario / salarioMinimoFixo;

		System.out.println("Quantidade de salario minimo (usuario) : R$ " + qtdSalarioMinimoUsuario);
		System.out.println("Quantidade d salario minimo (fixo) : R$ " + qtdSalarioMinimoFixo);
	}

}
