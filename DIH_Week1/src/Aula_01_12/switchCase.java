package Aula_01_12;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
		 Scanner scanner;
		 scanner = new Scanner(System.in);
		 int mes = scanner.nextInt();
		 String nomeDoMes;
		 String estacao = "";
		
		
//		1� Teste | Conhecendo o Switch Case
//		O break serve para parar a verifica��o enquando estiver identificado o valor dentro do escopo
		 
		switch (mes) {
		case 1:
			nomeDoMes = "Janeiro";
			estacao = "Ver�o";
			break;
		case 2:
			nomeDoMes = "Fevereiro";
			estacao = "Ver�o";
			break;
		case 3:
			nomeDoMes = "Mar�o";
			estacao = "Ver�o";
			break;
		case 4:
			nomeDoMes = "Abril";
			estacao = "Outono";
			break;
		default:
			nomeDoMes = "Inv�lido";
			break;
		} scanner.close();

		System.out.println(nomeDoMes);
		System.out.println(estacao);
		
	} 
}