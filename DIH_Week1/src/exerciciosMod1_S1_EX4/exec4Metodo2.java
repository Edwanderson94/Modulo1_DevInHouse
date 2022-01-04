package exerciciosMod1_S1_EX4;

import java.util.Scanner;

public class exec4Metodo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Digite um valor quebrado com duas casas decimais (Exemplo 2,50)");
		Scanner leitor = new Scanner (System.in);
		float numero = leitor.nextFloat();
		int numeroArredondado = Math.round(numero);
		System.out.println("Valor arredondado é \n" + numeroArredondado);
		
		leitor.close();
	}
}