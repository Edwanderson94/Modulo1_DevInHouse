package devinmoney.aplication;

import java.util.Locale;
import java.util.Scanner;
import devinmoney.agencias.Agencia;
import devinmoney.contas.ContaCorrente;

public class MenuBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitorConta = new Scanner(System.in);
		System.out.println("DIM - Gerando valor a cada dia! \n");
		
		boolean desconectar = false;
		boolean validaCPF = false;
		Integer adicionaConta = 0;
		
//		Solicitar a op��o do colaborador
		while (!desconectar) {
		 
			System.out.println("Selecione os servi�os que gostaria de utilizar "
								+ "\n Descreva as op��es conforme abaixo:"
								+ "\n Cadastrar - Cadastrar uma conta"
								+  "\n Caixa - Utilizar o caixa eletronico"
								+  "\n Sair - Desconectar-se");
			
			String leitorOpcao = leitorConta.next().toUpperCase();
			
			if (leitorOpcao.equals("CADASTRAR")) {
				System.out.println("Qual tipo de conta voc� deseja cadastrar? "
									+ "Digite as op��es conforme abaixo:"	
									+ "\n CC - Conta Corrente"
									+ "\n CP - Conta Poupanca"
									+ "\n CI - Conta Investimento");
				
				leitorOpcao = leitorConta.next().toUpperCase();
				
				switch (leitorOpcao) {			
//					Abertura de Conta Corrente
					case "CC":
//						Solicita��o de Nome completo do usuario:
						System.out.println("Vamos iniciar o processo de cadastro de conta corrente!"
											+ "\n Digite seu nome completo:");
						String nomeUserCc = leitorConta.next();
						
//						Solicita��o de Escolha da Agencia:
						System.out.println("Digite o n�mero da sua ag�ncia: "
											+ "\n 001 - Florian�polis"
											+ "\n 002 - S�o Jos�");
						
//						Identifica��o da Agencia baseada na classe Enum Agencia
						Agencia agenciaContaCc;
						int agenciaVerificaCc = leitorConta.nextInt();
						
						if (agenciaVerificaCc == 1) {
							agenciaContaCc = Agencia.FLORIANOPOLIS;
						} else {
							agenciaContaCc = Agencia.SAO_JOSE;
						}
//						System.out.println(agenciaContaCc);
						
//						Solicita��o de CPF do Usuario:
						System.out.println("Digite seu CPF \n"
											+ " Sem pontua��o e/ou h�fen.");
						String cpfContaCc = leitorConta.next();
						
//						Solicita��o da Renda do Usuario:
						System.out.println("Digite o valor de sua renda:");
						Double rendaContaCc = leitorConta.nextDouble();
						
//						Escolha do cheque especial
						System.out.println("Habilitar Cheque Especial?"
											+ "\n 01 - Sim"
											+ "\n 02 - N�o");
						String habilitarCheque = leitorConta.next();
															
//						Cria��o da count corrente, com as informa��es do usu�rio
						ContaCorrente contaCc = new ContaCorrente(nomeUserCc, cpfContaCc, agenciaVerificaCc == 2 ? Agencia.SAO_JOSE : Agencia.FLORIANOPOLIS, 
																	rendaContaCc, 0.0);				
						
//						Validador de CPF
						System.out.println(contaCc.validaCPF(cpfContaCc));
						System.out.println(cpfContaCc);
										
//						Mensagem de Cadastro de Conta Corrente
						System.out.println("Obrigado, voc� cadastrou a sua Conta Corrente \n");
						break;						
						
//					Abertura de conta poupan�a
					case "CP":
						System.out.println("Vamos iniciar o processo de cadastro de conta corrente!"
								+ "\n Digite seu nome completo:");
						String nomeUserCp = leitorConta.next();
						
//						Solicita��o de Escolha da Agencia:
						System.out.println("Digite o n�mero da sua ag�ncia: "
											+ "\n 001 - Florian�polis"
											+ "\n 002 - S�o Jos�");
						
//						Identifica��o da Agencia baseada na classe Enum Agencia
						Agencia agenciaContaCp;
						int agenciaVerificaCp = leitorConta.nextInt();
						
						if (agenciaVerificaCp == 1) {
							agenciaContaCp = Agencia.FLORIANOPOLIS;
						} else {
							agenciaContaCp = Agencia.SAO_JOSE;
						}
						
//						Solicita��o de CPF:
						System.out.println("Digite seu CPF \n"
								+ " Sem pontua��o e/ou h�fen.");
						String cpfContaCp = leitorConta.next();
			
						System.out.println("Digite o valor de sua renda:");
						Double rendaContaCp = leitorConta.nextDouble();			
						
//						Cria��o da count corrente, com as informa��es do usu�rio
						ContaCorrente contaCp = new ContaCorrente(nomeUserCp, cpfContaCp, agenciaVerificaCp == 2 ? Agencia.SAO_JOSE : Agencia.FLORIANOPOLIS, 
																	rendaContaCp, 0.0);
						System.out.println(contaCp.validaCPF(cpfContaCp));
						System.out.println(nomeUserCp);
						
//						Mensagem de Cadastro de Conta Corrente
						System.out.println("Obrigado, voc� cadastrou a sua Conta Poupan�a \n");
						break;					
				}
				
//			Condi��o para a op��o de utiliza��o do caixa eletronico
			} else if (leitorOpcao.equals("CAIXA")) {
				
//			Condi��o para a op��o de saida do menu
			} else if (leitorOpcao.equals("SAIR")) {
				desconectar = true;
				System.out.println("Desconectado");
			
//			Condi��o para a inser��o de dados inv�lidos
			} else  {
				System.out.println("Op��o Inv�lida, tente novamente! \n");
			} 
			

			
//			leitorConta.close();	
		} 
	}
}
