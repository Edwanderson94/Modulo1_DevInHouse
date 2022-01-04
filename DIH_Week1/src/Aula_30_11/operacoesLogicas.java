package Aula_30_11;

public class operacoesLogicas {

	public static void main(String[] args) {
		boolean b, c, d; 
		b = !(7 > 2);
		c = !(1 > 5);
		d = b && c;
		
		//Regra dos operadores, verdadeiro e falso
		/*
		true && true = true;
		true && false = false; 
		true || true = true; 
		true || false = true; 
		*/
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
