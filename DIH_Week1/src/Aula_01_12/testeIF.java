package Aula_01_12;

import java.util.Scanner;

public class testeIF {

	public static void main(String[] args) {
		
//		Primeiro Teste | Entendendo a estrutura
//		if (true) {
//			System.out.println("Verdadeiro");
//		} else {
//			System.out.println("Falsa!");
//		}
		
		
//		Segundo Teste | Estrutura errada de criação
//		if (false) {
//			System.out.println("Verdadeiro");
//		} else {
//			System.out.println("Falsa");
//		} else {
//			System.out.println("Outra condição falsa");
//		}
		
		
//		3°teste | Exercitando parte lógica
//		Scanner scanner = new Scanner(System.in);
//		int idade = scanner.nextInt();
//		if (idade >= 18) {
//			System.out.println("Maior de Idade");
//		} else {
//			System.out.println("Menos de Idade");
//		}
//		scanner.close();
		
//		4°teste | Explicando mais sobre IF e ELSE IF
//		Scanner scanner; 
//		scanner = new Scanner(System.in);
//		int idade = scanner.nextInt();
//		
//		if (idade > 18) {
//			System.out.println("Maior de Idade");
//		} else if (idade == 18) {
//			System.out.println("Depende do dia do seu aniversário");
//		} else 
//			System.out.println("Menor de Idade");
//		scanner.close();
		
//		5°Teste
		Scanner scanner;
		scanner = new Scanner(System.in);
		int idade = scanner.nextInt();

		if (idade > 17) {
			System.out.println("Você é maior de idade");
		} else if (idade == 18) {
			System.out.println("Você é maior de idade também");
		} else
			System.out.println("Você é menor de idade");
		scanner.close();
	}
}
