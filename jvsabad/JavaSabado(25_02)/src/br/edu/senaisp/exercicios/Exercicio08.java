package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		String nome, endereco;
		int DDD, telefone;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite o seu endereço: ");
		endereco = sc.nextLine();
		
		System.out.println("Digite o seu DDD: ");
		DDD = sc.nextInt();
		
		System.out.println("Digite o seu telefone: ");
		telefone = sc.nextInt();
		
		sc.close();
		
		
		System.out.println("Seu nome: " + nome);

		System.out.println("Endereço: " + endereco);
		
		System.out.println("Telefone: (" + DDD + ") " + telefone );
	}
	
}


//Ler nome, endereço e telefone e imprimi-los.