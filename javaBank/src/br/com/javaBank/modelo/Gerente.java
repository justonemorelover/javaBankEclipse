package br.com.javaBank.modelo;

public class Gerente extends Funcionario {
	
	private Autenticador Login = new Autenticador();
	private double bonificacao = super.getSalario() * 0.1;

	/**
	 * 
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.Login = new Autenticador();
	}
	
	public Gerente() {
	};
	
	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public double getSalario() {
		return super.getSalario() + bonificacao;
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
