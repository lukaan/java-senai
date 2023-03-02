package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		char genero;
		int idade, tempoContribuicao;
		int tempoRestanteIdadeH, tempoRestanteIdadeM;
		int tempoRestanteContribuicaoH, tempoRestanteContribuicaoM;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira sua idade: ");
		idade = sc.nextInt();

		System.out.println("Insira o seu gênero, H (Homem) ou M (Mulher):  ");
		genero = sc.next().charAt(0);
		genero = Character.toUpperCase(genero);
		
		System.out.println("Insira o seu tempo de contribuição: ");
		tempoContribuicao = sc.nextInt();

		sc.close();

		if (idade < tempoContribuicao) {
			System.out.println("Digite corretamente a sua idade e o seu tempo de contribuição.");
			return;
			
		}
		
		switch (genero) {

		case 'H':
			if (idade >= 65 || tempoContribuicao >= 35) {
				System.out.println("Você já tem o direito de aposentadoria!");
				break;
			} else if (idade < 65 || tempoContribuicao < 35) {

				tempoRestanteIdadeH = 65 - idade;
				tempoRestanteContribuicaoH = 35 - tempoContribuicao;

				System.out.println("Você ainda não tem o direito de aposentadoria! ");
				System.out.println("O tempo restante (idade): " + tempoRestanteIdadeH);
				System.out.println("O tempo restante (contribuição): " + tempoRestanteContribuicaoH);
			}

			break;

		case 'M':
			if (idade >= 60 || tempoContribuicao >= 30) {
				System.out.println("Você já tem o direito de aposentadoria!");
				break;
			} else if (idade < 60 || tempoContribuicao < 30) {

				tempoRestanteIdadeM = 60 - idade;
				tempoRestanteContribuicaoM = 30 - tempoContribuicao;

				System.out.println("Você ainda não tem o direito de aposentadoria :( ");
				System.out.println("O tempo restante (idade): " + tempoRestanteIdadeM);
				System.out.println("O tempo restante (contribuição): " + tempoRestanteContribuicaoM);

			}

			break;

		}
	}
}

/*
Considere a seguinte informação a respeito do cálculo da aposentadoria. Para se
aposentar por idade, as mulheres precisam ter atingido 60 anos de idade e os
homens, 65. Já na aposentadoria por tempo de contribuição, o tempo mínimo exigido é
de 30 anos para as mulheres e de 35 anos para os homens. Com base nessas
informações, elabore uma classe que receba a idade de uma pessoa, seu
sexo e a quantidade de anos de contribuição. A seguir, calcule a quantidade de anos
que falta de contribuição para se aposentar, ou então emita a mensagem: “você já tem
o direito a aposentadoria”.
*/
