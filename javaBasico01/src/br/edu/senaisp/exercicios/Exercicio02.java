package br.edu.senaisp.exercicios;

public class Exercicio02 {
	
	public static void main (String[] args) {
		double mediaArit1 = 0;
		double mediaArit2 = 0;
		double somaMedia = 0;
		double mediaMedia = 0;
		
		mediaArit1 = (8 + 9 + 7) / 3;
		mediaArit2 = (4 + 5 + 6) / 3;
		somaMedia = (mediaArit1 + mediaArit2);
		mediaMedia = (mediaArit1 + mediaArit2) / 2;
		
		System.out.println("Media aritmetica 1: " + mediaArit1);
		System.out.println("Media aritmetica 2: " + mediaArit2);
		System.out.println("Soma das medias aritmeticas: " + somaMedia);
		System.out.println("Media das medias: " + mediaMedia);
	}

}
