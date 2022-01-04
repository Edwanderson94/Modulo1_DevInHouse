package Aula_02_12;

import java.util.Scanner;

public class testePalindromo {

	public static void main(String[] args) {

//		Palindromo é uma palavra que ao contrário é ela mesma exemplo: 
//		"Ovo", "Hannah", "Osso", entre outras.
//		Exemplo: String é um array: 
//		Teste => ['T', 'e', 's', 't', 'e']
		
//		Exemplo de manipulação de Strings
//		 01234
//		"Texto"
//		String texto = "t";
//		texto = texto + "e";
//		texto += "x";
//		texto = texto + texto.charAt(0);
//		texto += "o";
//		System.out.println(texto);
				
		Scanner leitor = new Scanner(System.in);
		String leitura = leitor.nextLine();
		String leituraAoContrario = "";
		
		for (int i = leitura.length() - 1; i >= 0; i--) {
			leituraAoContrario += leitura.charAt(i);		
		}
		System.out.println(leituraAoContrario);
		System.out.println(leitura);
		System.out.println(leitura.equalsIgnoreCase(leituraAoContrario));
		leitor.close();
	}
}
