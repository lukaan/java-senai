package br.edu.senaisp.exercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		int anos, meses, dias, anosDias = 0, mesesDias = 0, totalDias = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira os seus anos: ");
		anos = sc.nextInt();
		
		System.out.print("Insira os seus meses: ");
		meses = sc.nextInt();
		
		System.out.print("Insira os seus dias: ");
		dias = sc.nextInt();
		
			anosDias = (anos * 365);
			mesesDias = (meses * 30);

		
		totalDias = (anosDias + mesesDias + dias);
		
		System.out.println("A sua idade representada em dias é de: " + totalDias);
		
		sc.close();
		
// colocar a condição de não aceitar meses > 12 // dias > 30
	}

}
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)