package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {

		double tempoGasto, velocidadeMedia, distancia, litrosCombustivel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tempo percorrido na viagem: ");
		tempoGasto = sc.nextDouble();
		
		System.out.println("Digite a velocidade media da viagem: ");
		velocidadeMedia = sc.nextDouble();
		
		sc.close();
		
		distancia = tempoGasto * velocidadeMedia;
		
		litrosCombustivel = distancia / 12;
		
		System.out.println("Velocidade media: " + velocidadeMedia);
		System.out.println("Tempo: " + tempoGasto);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Litros de combustivel: " + litrosCombustivel);
		
		
	}
}
