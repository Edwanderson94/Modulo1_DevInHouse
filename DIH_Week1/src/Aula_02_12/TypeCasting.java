package Aula_02_12;

import java.util.Locale;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
//		COERSÃO: Conversão dentro do mesmo dominio de elementos
//		int x = 10;
//		long y = x; 
//		System.out.println(y);

//		CASTING: Conversão assumindo riscos de perda, dominios de elementos diferentes;
//		Quando temos um valor quebrado ele ignora a sobra, não arredonda para mais nem para menos.
//		int y2 = (int) x2;
//		System.out.println(y2);

//		double x3 = 5.3;
//		int y3 = (int) x3;
//		System.out.println(y3);
				
//		double x4 = 5.5;
//		float y4 = (float) x4;
//		System.out.println(y4);
		
//		float x5 = 5.5;
//		double y5 = x5;
//		System.out.println(y5); 

		
//		Identificar qual a localidade do seu computador: 		
//		Locale localidade = Locale.getDefault();
//		System.out.println("Qual a localidade do seu PC \r" + localidade);
		
//		double x6 = 5.7;
//		int y6 = (int) x6;
//		System.out.println("Conversão de Double para INT explicita \r" + y6);
//		
//		double x7 = 5.0;
//		float y7 = (float) x7; 
//		
//		float x8 = 5.5f;
//		double y8 = x8;
//		
//		int x9 = y6 > 10 ? (int) x7 : (int) y8;
		
		Scanner entrada = new Scanner(System.in);
		String numero = entrada.nextLine();
		int numeroInteiro = Integer.parseInt(numero);
		Double.parseDouble(numero);
		System.out.println(numeroInteiro);
		
//		int numeroInteiro2 = 10;
//		String numero2 = "" + numeroInteiro2;
//		System.out.println("Conversão de INT para String \r" + numeroInteiro2);
		entrada.close();
	}
}
