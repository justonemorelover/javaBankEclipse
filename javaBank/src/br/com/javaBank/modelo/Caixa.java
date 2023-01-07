package br.com.javaBank.modelo;

public class Caixa extends Funcionario implements Autenticavel {
	
	private Autenticador Login = new Autenticador();;
	private double bonificacao = super.getSalario() * 0.05;;

	/**
	 * 
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Caixa(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public Caixa() {
	};
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return super.getSalario() + this.bonificacao;
	}
	
	public void setSenha(int senha) {
		Login.setSenha(senha);
	}
	
	public int getSenha() {
		return super.getSenha();
	}

	public boolean autentica(int senha) {
		return Login.autentica(senha);
	}

	@Override
	public int compareTo(Funcionario o) {
		return super.compareTo(o);
	}
}
