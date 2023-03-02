package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		int numUsuario;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero inteiro e positivo: ");
		numUsuario = sc.nextInt();

		sc.close();

		System.out.println("Sucessor: " + (numUsuario + 1));
		System.out.println("Antecessor: " + (numUsuario - 1));

	}

}
