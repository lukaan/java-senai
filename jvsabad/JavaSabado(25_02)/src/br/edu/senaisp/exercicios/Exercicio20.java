package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		int numero, 
			numeroLido,
			numeroRevertido = 0, 
			resto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro e positivo: ");
		numero = sc.nextInt();
		
		sc.close();
		
		numeroLido = numero;
		
		while (numero != 0) {
			resto = numero % 10;
			numeroRevertido = numeroRevertido * 10 + resto;
			numero = numero/10;
		}
		
		System.out.println("Numero: " + numeroLido);
		System.out.println("Numero Invertido: " + numeroRevertido);
		
		
		
	}
}
