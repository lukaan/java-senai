package br.edu.senaisp.exercicios;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {
		
		double salarioBruto, salarioLiquido, valorHoraAula, qtdHoraAula, porcentagemINSS;
		int totalNumeroAulas;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor da hora das aulas: ");
		valorHoraAula = sc.nextDouble();
		
		System.out.print("Digite a quantidade de horas trabalhadas por aula: ");
		qtdHoraAula = sc.nextDouble();
		
		System.out.print("Digite a quantidade de aulas dadas no mês referente: ");
		totalNumeroAulas = sc.nextInt();
		
		
		System.out.print("Digite a porcentagem do INSS referente ao seu salario: ");
		porcentagemINSS = sc.nextDouble();
		
		sc.close();
		
		salarioBruto = (valorHoraAula * qtdHoraAula) * totalNumeroAulas;
		
		salarioLiquido = salarioBruto - (salarioBruto * (porcentagemINSS / 100));
		
		System.out.println("Salario Bruto: R$" + salarioBruto);
		System.out.println("Salario Liquido: R$" + salarioLiquido);
		
		
	}

}
