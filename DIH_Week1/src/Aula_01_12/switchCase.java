package Aula_01_12;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		 Scanner scanner;
		 scanner = new Scanner(System.in);
		 int mes = scanner.nextInt();
		 String nomeDoMes;
		 String estacao = "";
		
		
//		1° Teste | Conhecendo o Switch Case
//		O break serve para parar a verificação enquando estiver identificado o valor dentro do escopo
		 
		switch (mes) {
		case 1:
			nomeDoMes = "Janeiro";
			estacao = "Verão";
			break;
		case 2:
			nomeDoMes = "Fevereiro";
			estacao = "Verão";
			break;
		case 3:
			nomeDoMes = "Março";
			estacao = "Verão";
			break;
		case 4:
			nomeDoMes = "Abril";
			estacao = "Outono";
			break;
		default:
			nomeDoMes = "Inválido";
			break;
		} scanner.close();

		System.out.println(nomeDoMes);
		System.out.println(estacao);
		
	} 
}