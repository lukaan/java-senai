package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String codPeca1, codPeca2;
		double vlrPeca1, vlrPeca2, porcentagemIPI, vlrFinal;
		int qtdPeca1, qtdPeca2;
		
		Scanner sc = new Scanner (System.in);

		System.out.println("Digite o codigo da peca 1: ");
		codPeca1 = sc.nextLine();
		
		System.out.println("Digite a quantidade das pecas 1: ");
		qtdPeca1 = sc.nextInt();
		
		System.out.println("Digite o valor da peca 1: ");
		vlrPeca1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o codigo da peca 2: ");
		codPeca2 = sc.nextLine();
		
		System.out.println("Digite a quantidade das pecas 2: ");
		qtdPeca2 = sc.nextInt();
		
		System.out.println("Digite o valor da peca 2: ");
		vlrPeca2 = sc.nextDouble();
		
		System.out.println("Digite a porcentagem da IPI a ser acrescentado: ");
		porcentagemIPI = sc.nextDouble();
		
		sc.close();
		
		vlrFinal = (vlrPeca1 * qtdPeca1 + vlrPeca2 * qtdPeca2) * (porcentagemIPI/100 + 1);
		System.out.println("Codigo peca 1: " + codPeca1);
		System.out.println("Codigo peca 2: " + codPeca2);
		System.out.println("O valor total a ser pago é de: " + vlrFinal);
		
	}

}
