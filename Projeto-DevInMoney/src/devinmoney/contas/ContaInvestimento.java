package devinmoney.contas;

import devinmoney.agencias.Agencia;

public class ContaInvestimento extends DadosConta {
	
	protected Double valorInvestido;
	
	public ContaInvestimento(String nome, String cpf, Agencia agencia, Double renda, Double saldo,
			Double valorInvestido) {
		super(nome, cpf, agencia, renda, saldo);
		this.valorInvestido = valorInvestido;
	}

	public Double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(Double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	@Override
	public String toString() {
		return "ContaInvestimento [valorInvestido=" + valorInvestido + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getAgencia()=" + getAgencia() + ", getRenda()=" + getRenda() + ", getSaldo()="
				+ getSaldo() + "]";
	}

}
