package br.edu.senaisp.exercicios;

import java.util.Scanner;

// INCOMPLETO

public class Exercicio15 {

	public static void main(String[] args) {

		double angulo, anguloRad; //secante, cossecante, cotangente;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um angulo: ");
		angulo = sc.nextDouble();
		
		sc.close();
		
		anguloRad = Math.toRadians(angulo);
		
		/*secante = 1/cosseno;
		cossecante = 1/seno;
		cotangente = 1/tangente;
		*/
		System.out.println("Seno: " + Math.sin(anguloRad));
		System.out.println("Cosseno: " + Math.cos(anguloRad));
		System.out.println("Tangente: " + Math.tan(anguloRad));
		System.out.println("Secante: " + (1/Math.cos(anguloRad)));
		
	}
}
//Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante,
//cossecante e cotangente deste ângulo.