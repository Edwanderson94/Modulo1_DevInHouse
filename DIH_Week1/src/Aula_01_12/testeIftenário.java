package Aula_01_12;

import java.util.Scanner;

public class testeIften�rio {

	public static void main(String[] args) {
		
//		1�Teste | IF Ten�rio
//		Scanner scanner = new Scanner(System.in);
//		int idade = scanner.nextInt();
//
//		String status = idade > 17 
//				? "MAIOR DE IDADE" 
//				: "MENOR DE IDADE";
//
//		System.out.println(status);
//		scanner.close();
		
//		2�Teste | IF Ten�rio
//		Scanner scanner = new Scanner(System.in);
//		int idade = scanner.nextInt();
//
//		String status = idade > 60 
//				? "Idoso" 
//				: idade > 18
//					? "Maior de Idade"
//					: "Menor de Idade";
//
//		System.out.println(status);
//		scanner.close();
		
//		2.1 Teste | Exemplificando IF e IF Ten�rio
//		if (estoque) {
//			x = disponivel
//		} else {
//			x = indisponivel
//		} 		
//		
//		2.2 Teste | Vale mais apena sintetizar usando IF Ten�rio
//			boolean x = estoque ? disponivel : indisponivel 
		
//		3� Teste | Explicando if e else
//		Scanner scanner = new Scanner(System.in);
//		int idade = scanner.nextInt();
//
//		if (idade > 60) {
//		} else if (idade > 18) {
//
//		} else {
//
//		} scanner.close();
		
//		4� Teste | Explicando
		Scanner scanner;
		scanner = new Scanner(System.in);
		int idade = scanner.nextInt();
		
		String status = idade > 60 ? "Idoso"
				: "N�o Idoso";
		
		System.out.println(status);
		scanner.close();
	}
}
