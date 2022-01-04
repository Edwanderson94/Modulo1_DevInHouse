package exerciciosMod1_S1_EX5;

import java.util.Scanner;

public class exec5Metodo1 {

	public static void main(String[] args) {
		
		System.out.println("Escreva seu primeiro nome");
		Scanner leitor = new Scanner(System.in);
		String nomeUsuario = leitor.nextLine();
		System.out.println("Seu nome possui " + nomeUsuario.length() + " Letras");
		
		leitor.close();
	}
}