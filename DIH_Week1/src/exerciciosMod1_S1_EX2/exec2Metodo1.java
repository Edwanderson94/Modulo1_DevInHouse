package exerciciosMod1_S1_EX2;

import java.util.Scanner;

public class exec2Metodo1 {

	public static void main(String[] args) throws Exception {

//		Relacionar os tipos primitivos com as descri��es
		System.out.println("Digite um valor, numero ou escrita");
		Scanner captura = new Scanner(System.in);
		while (true) {
			String dadosUsuario = captura.nextLine();

			try {
				Integer.parseInt(dadosUsuario);
				System.out.println(dadosUsuario + " � inteiro");
			} catch (Exception e) {
				try {
					float f = Float.parseFloat(dadosUsuario);
					System.out.println(dadosUsuario + " � decimal");
				} catch (Exception ee) {
					if (dadosUsuario.length() == 1) {
						System.out.println(dadosUsuario + " � char");
					} else {
						System.out.println(dadosUsuario + " � String");
						
						
						captura.close();
					}
				}
			}
		}

	}
}