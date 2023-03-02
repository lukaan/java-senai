package br.edu.senaisp.exercicios;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		double valorProduto, desconto, valorDesconto, valorFinal;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira o Valor do Produto: ");
		valorProduto = sc.nextDouble();
		
		System.out.println("Insira a porcentagem do Desconto: ");
		desconto = sc.nextDouble();
		
		valorDesconto = (valorProduto * desconto) / 100;
		valorFinal = valorProduto - valorDesconto;
		
		System.out.println("O valor do desconto é de: " + valorDesconto);
		System.out.println("O valor final é de: " + valorFinal);

		sc.close();
		
	}

}

/*1. Usando a classe BufferedReader para entrada de dados, crie uma classe que
receba o valor de um produto e a porcentagem de desconto, calcule e mostre o valor
do desconto e o valor do produto com o desconto. Observação: o valor do desconto é
calculado por meio da fórmula: valor do desconto = valor do produto * percentual de
desconto / 100.
*/
