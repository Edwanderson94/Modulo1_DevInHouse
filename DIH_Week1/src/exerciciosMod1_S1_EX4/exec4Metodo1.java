package exerciciosMod1_S1_EX4;

import java.util.Scanner;

public class exec4Metodo1 {

	public static void main(String[] args) {
		
		
		System.out.println("Digite um valor quebrado com duas casas decimais (Exemplo 2,50)");
		Scanner leitor = new Scanner (System.in);
		float numero = leitor.nextFloat();
		int numeroConvertido = (int) numero;
		numero = (int) numeroConvertido;
		
		System.out.println("Número Convertido\n" + numeroConvertido);
		
		leitor.close();
	}
}
