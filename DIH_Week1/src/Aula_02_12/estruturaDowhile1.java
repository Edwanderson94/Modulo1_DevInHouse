package Aula_02_12;

import java.util.Scanner;
import java.util.Random;

public class estruturaDowhile1 {

//	Vamos gerar um número aleatório de 5 a 10
//	e pedir ao usuário que advinhe esse número
// -> incrementando Do While no exercicio

	public static void main(String[] args) {

		// Declarando a função Ramdom separado
		// Ramdom random = new Random();
		int numeroSecreto = new Random().nextInt(6) + 5;

		Scanner leitor = new Scanner(System.in);
		int tentativaUsuarioDoWhile;
		do {
			System.out.println("Tente adivinhar o número!");
			tentativaUsuarioDoWhile = leitor.nextInt();
			//Exemplo de declarar dentro de um escopo
			//String nome = "Edwanderson";
		} while (numeroSecreto != tentativaUsuarioDoWhile);

		System.out.println("Muito bem");
		leitor.close();
	}
}