package Aula_02_12;

import java.util.Scanner;
import java.util.Random;

public class estruturaWhile {

//	Vamos gerar um n�mero aleat�rio de 5 a 10
//	e pedir ao usu�rio que advinhe esse n�mero

	public static void main(String[] args) {

		// Declarando a fun��o Ramdom separado
		// Ramdom random = new Random();
		int numeroSecreto = new Random().nextInt(6) + 5;

		System.out.println("Tente adivinhar o n�mero!");
		Scanner leitor = new Scanner(System.in);
		int tentativaUsuario = leitor.nextInt();

		while (numeroSecreto != tentativaUsuario) {
			System.out.println("Tente novamente!");
			tentativaUsuario = leitor.nextInt();
		}
		System.out.println("Muito bem");
		leitor.close();
	}
}