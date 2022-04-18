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
		
//		Solicitar a opção do colaborador
		while (!desconectar) {
		 
			System.out.println("Selecione os serviços que gostaria de utilizar "
								+ "\n Descreva as opções conforme abaixo:"
								+ "\n Cadastrar - Cadastrar uma conta"
								+  "\n Caixa - Utilizar o caixa eletronico"
								+  "\n Sair - Desconectar-se");
			
			String leitorOpcao = leitorConta.next().toUpperCase();
			
			if (leitorOpcao.equals("CADASTRAR")) {
				System.out.println("Qual tipo de conta você deseja cadastrar? "
									+ "Digite as opções conforme abaixo:"	
									+ "\n CC - Conta Corrente"
									+ "\n CP - Conta Poupanca"
									+ "\n CI - Conta Investimento");
				
				leitorOpcao = leitorConta.next().toUpperCase();
				
				switch (leitorOpcao) {			
//					Abertura de Conta Corrente
					case "CC":
//						Solicitação de Nome completo do usuario:
						System.out.println("Vamos iniciar o processo de cadastro de conta corrente!"
											+ "\n Digite seu nome completo:");
						String nomeUserCc = leitorConta.next();
						
//						Solicitação de Escolha da Agencia:
						System.out.println("Digite o número da sua agência: "
											+ "\n 001 - Florianópolis"
											+ "\n 002 - São José");
						
//						Identificação da Agencia baseada na classe Enum Agencia
						Agencia agenciaContaCc;
						int agenciaVerificaCc = leitorConta.nextInt();
						
						if (agenciaVerificaCc == 1) {
							agenciaContaCc = Agencia.FLORIANOPOLIS;
						} else {
							agenciaContaCc = Agencia.SAO_JOSE;
						}
//						System.out.println(agenciaContaCc);
						
//						Solicitação de CPF do Usuario:
						System.out.println("Digite seu CPF \n"
											+ " Sem pontuação e/ou hífen.");
						String cpfContaCc = leitorConta.next();
						
//						Solicitação da Renda do Usuario:
						System.out.println("Digite o valor de sua renda:");
						Double rendaContaCc = leitorConta.nextDouble();
						
//						Escolha do cheque especial
						System.out.println("Habilitar Cheque Especial?"
											+ "\n 01 - Sim"
											+ "\n 02 - Não");
						String habilitarCheque = leitorConta.next();
															
//						Criação da count corrente, com as informações do usuário
						ContaCorrente contaCc = new ContaCorrente(nomeUserCc, cpfContaCc, agenciaVerificaCc == 2 ? Agencia.SAO_JOSE : Agencia.FLORIANOPOLIS, 
																	rendaContaCc, 0.0);				
						
//						Validador de CPF
						System.out.println(contaCc.validaCPF(cpfContaCc));
						System.out.println(cpfContaCc);
										
//						Mensagem de Cadastro de Conta Corrente
						System.out.println("Obrigado, você cadastrou a sua Conta Corrente \n");
						break;						
						
//					Abertura de conta poupança
					case "CP":
						System.out.println("Vamos iniciar o processo de cadastro de conta corrente!"
								+ "\n Digite seu nome completo:");
						String nomeUserCp = leitorConta.next();
						
//						Solicitação de Escolha da Agencia:
						System.out.println("Digite o número da sua agência: "
											+ "\n 001 - Florianópolis"
											+ "\n 002 - São José");
						
//						Identificação da Agencia baseada na classe Enum Agencia
						Agencia agenciaContaCp;
						int agenciaVerificaCp = leitorConta.nextInt();
						
						if (agenciaVerificaCp == 1) {
							agenciaContaCp = Agencia.FLORIANOPOLIS;
						} else {
							agenciaContaCp = Agencia.SAO_JOSE;
						}
						
//						Solicitação de CPF:
						System.out.println("Digite seu CPF \n"
								+ " Sem pontuação e/ou hífen.");
						String cpfContaCp = leitorConta.next();
			
						System.out.println("Digite o valor de sua renda:");
						Double rendaContaCp = leitorConta.nextDouble();			
						
//						Criação da count corrente, com as informações do usuário
						ContaCorrente contaCp = new ContaCorrente(nomeUserCp, cpfContaCp, agenciaVerificaCp == 2 ? Agencia.SAO_JOSE : Agencia.FLORIANOPOLIS, 
																	rendaContaCp, 0.0);
						System.out.println(contaCp.validaCPF(cpfContaCp));
						System.out.println(nomeUserCp);
						
//						Mensagem de Cadastro de Conta Corrente
						System.out.println("Obrigado, você cadastrou a sua Conta Poupança \n");
						break;					
				}
				
//			Condição para a opção de utilização do caixa eletronico
			} else if (leitorOpcao.equals("CAIXA")) {
				
//			Condição para a opção de saida do menu
			} else if (leitorOpcao.equals("SAIR")) {
				desconectar = true;
				System.out.println("Desconectado");
			
//			Condição para a inserção de dados inválidos
			} else  {
				System.out.println("Opção Inválida, tente novamente! \n");
			} 
			

			
//			leitorConta.close();	
		} 
	}
}
