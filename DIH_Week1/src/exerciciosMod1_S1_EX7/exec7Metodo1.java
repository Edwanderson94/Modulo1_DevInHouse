package exerciciosMod1_S1_EX7;

import java.util.Scanner;
//import java.util.Locale;

public class exec7Metodo1 {

	public static void main(String[] args) {
		
//		Locale locale = Locale.getDefault();
//		System.out.println(locale);
		
//		Adicionar a classe de formatação de numeros

		System.out.println("Insira um número");
		Scanner leitor = new Scanner(System.in);
		int numeroInserido = leitor.nextInt();
		long calculoFatorial = numeroInserido;
		
		for	(int i = 1; i < numeroInserido; i++) {
			calculoFatorial = calculoFatorial * i;
		}
		System.out.println("O fatorial de " + numeroInserido + " é " 
		+ calculoFatorial);
		leitor.close();
	}

}
