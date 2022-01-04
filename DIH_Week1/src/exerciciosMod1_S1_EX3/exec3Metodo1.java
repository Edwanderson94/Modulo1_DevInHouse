package exerciciosMod1_S1_EX3;

import java.util.Scanner;

public class exec3Metodo1 {

	public static void main(String[] args) {
		
		System.out.println("Digite seu Sobrenome");
		Scanner digiteSobrenome = new Scanner(System.in);
		String sobreNomeUsuario = digiteSobrenome.nextLine();
				
		System.out.println("Digite seu Nome");
		Scanner digiteNome = new Scanner(System.in);
		String nomeUsuario = digiteNome.nextLine();
		
		System.out.println("Digite composições complementares do seu nome "
							+ "(Exemplo: Um terceiro nome)");
		Scanner digiteComplemento = new Scanner(System.in);
		String complementoUsuario = digiteComplemento.nextLine();
		
		System.out.println("Nome Completo: \n" + nomeUsuario + " " + sobreNomeUsuario + " " + 
							complementoUsuario);
		
		digiteSobrenome.close();
		digiteNome.close();
		digiteComplemento.close();
	}  
}
