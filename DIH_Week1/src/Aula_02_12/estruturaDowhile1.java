package Aula_02_12;

import java.util.Scanner;
import java.util.Random;

public class estruturaDowhile1 {

//	Vamos gerar um n�mero aleat�rio de 5 a 10
//	e pedir ao usu�rio que advinhe esse n�mero
// -> incrementando Do While no exercicio

	public static void main(String[] args) {

		// Declarando a fun��o Ramdom separado
		// Ramdom random = new Random();
		int numeroSecreto = new Random().nextInt(6) + 5;

		Scanner leitor = new Scanner(System.in);
		int tentativaUsuarioDoWhile;
		do {
			System.out.println("Tente adivinhar o n�mero!");
			tentativaUsuarioDoWhile = leitor.nextInt();
			//Exemplo de declarar dentro de um escopo
			//String nome = "Edwanderson";
		} while (numeroSecreto != tentativaUsuarioDoWhile);

		System.out.println("Muito bem");
		leitor.close();
	}
}