package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
	
		int idadeDias, anos, meses, dias;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite sua idade em anos: ");
		anos = sc.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		meses = sc.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		dias = sc.nextInt();
		
		sc.close();
		
		anos = anos * 365;
		meses = meses * 30;
		
		idadeDias = (anos+meses+dias);
		
		System.out.println("Sua idade em dias: " + idadeDias);
		

	}

}
