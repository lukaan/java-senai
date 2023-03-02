package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		double salario, qtdKw, valor, valorDescontado, valorDesconto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o seu salario: ");
		salario = sc.nextDouble();
		
		System.out.println("Insira a quantidade de Quilowatts usada no mês: ");
		qtdKw = sc.nextDouble();
		
		sc.close();
		
		valor = ((salario/7) * (qtdKw/100));
		valorDescontado = (valor * 0.10); // Coloquei +1 variavel só pra deixa bonitin
		// Se nao seria assim --> valorDesconto = valor - valorDescontado;
		
		valorDesconto = valor - (valor * 0.10);
		
	
		System.out.println("Valor: R$" + valor);
		System.out.println("Valor Descontado: R$" + valorDescontado);
		System.out.println("Valor com desconto: R$" + valorDesconto);
		
		
		
		
		/*
		 * 100 kw = 1/7 salario
		 * Receber salario, qtd de kw gasta
		 * Calcule o valor em reais para ser pago
		 * Um novo valor com desconto de 10%
		*/
	}
}
