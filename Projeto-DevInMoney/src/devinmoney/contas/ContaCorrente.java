package devinmoney.contas;

import devinmoney.agencias.Agencia;

public class ContaCorrente extends DadosConta {
	
	private Double chequeEspecial = 0.0;

//	Construtor da Conta Corrente - Possibilita a criação do objeto
	public ContaCorrente(String nome, String cpf, Agencia agencia, Double renda, Double saldo) {
		super(nome, cpf, agencia, renda, saldo);
		this.chequeEspecial = chequeEspecial;
	} 
	
	public void chequeCalc(Double chequeEspecial) {
		this.chequeEspecial = renda * 40 / 100;
		System.out.println(this.chequeEspecial);		
	}
	
	public Double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public String toString() {
		return "ContaCorrente [getNome()=" + getNome() + ", getNumeroConta()=" + getNumeroConta() + ", getCpf()="
				+ getCpf() + ", getAgencia()=" + getAgencia() + ", getRenda()=" + getRenda() + ", getSaldo()="
				+ getSaldo() + "]";
	}
}
