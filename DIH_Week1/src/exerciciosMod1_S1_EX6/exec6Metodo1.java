package exerciciosMod1_S1_EX6;

import java.util.Scanner;

public class exec6Metodo1 {

	public static void main(String[] args) {
		
		System.out.println("Digite as tr�s notas do semestre\n"
				+ "Come�e digitando a nota B1");
		Scanner leitorUm = new Scanner(System.in);
		float notaUm = leitorUm.nextFloat();
		
//		Verificador de notas v�lidas (n�o deu certo, pensar melhor)
//		if (notaUm >= 0 && notaUm <=10) {
//			System.out.println("Essa Nota � v�lida");
//		} else if (notaUm < 0 && notaUm > 10) {
//			System.out.println("Essa Nota � inv�lida");
//		} else {
//			System.out.println("Nota Invalida, tente novamente!");
//			notaUm = leitorUm.nextFloat();
//		}
							
		System.out.println("Digite a nota do B2");
		Scanner leitorDois = new Scanner(System.in);
		float notaDois = leitorDois.nextFloat();
	
		System.out.println("Digite a nota do B3");
		Scanner leitorTres = new Scanner(System.in);
		float notaTres = leitorTres.nextFloat();
		
//		Calculo das notas e arredondamento
		float mediaFinal = (notaUm + notaDois + notaTres)/3;
		int mediaArredondada = Math.round(mediaFinal);
		
		System.out.println("Calculo da m�dia da nota:\n" + mediaArredondada);
		
//		Verifica o status do aluno baseado na nota (Aprovado, Reprovado e Recupera��o)
		
		if (mediaFinal >= 7) {
			System.out.println("Aluno Aprovado!");
		} else if (mediaFinal >= 5) {
			System.out.println("Aluno em Recupera��o");
		} else {
			System.out.println("Aluno Reprovado");
		}
		
		leitorTres.close();
		leitorDois.close();
		leitorUm.close();
	}

}
