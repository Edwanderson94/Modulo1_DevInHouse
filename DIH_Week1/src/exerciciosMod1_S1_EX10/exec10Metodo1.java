package exerciciosMod1_S1_EX10;

import java.util.Scanner;

public class exec10Metodo1 {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	int numeroPrimo;
	int numeroDivisores = 0;
	
	System.out.println("Digite um número");
	numeroPrimo = leitor.nextInt();
	
	for (int i = 1; i <= numeroPrimo; i++) {
		if (numeroPrimo % i == 0) {
			numeroDivisores ++;
		}
	}
		
		if (numeroDivisores == 2) {
			System.out.println("O número digitado é Primo");
		} else {
			System.out.println("O número digitado não é Primo");
		}
		leitor.close();
	}

}
