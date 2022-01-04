package Aula_01_12;

import java.util.Scanner;

public class switchExpression {

	public static void main(String[] args) {
		
//		1°Teste | Switch Expression -> Disponivel apenas a partir de java 14
		
		Scanner scanner;
		scanner = new Scanner(System.in);
		int mes = scanner.nextInt();
		String nomeDoMes;
		
//		String estacao = switch (mes) {
//			case 1 -> "Janeiro";
//			case 2 -> "Fevereiro";
//			case 3 -> "Março";
//			case 4 -> "Abril";
//			default -> "Invalido";
//		};
//		System.out.println(estacao);
		
		scanner.close();
	}
}
