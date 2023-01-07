package br.com.javaBank.modelo;

public class Diretor extends Funcionario {
	
	private Autenticador Login = new Autenticador();
	private double bonificacao = super.getSalario() * 0.15;

	/**
	 * 
	 * @param nome
	 * @param cpf
	 * @param salario
	 */
	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}
	
	public Diretor() {
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
	
	public boolean autentica(int senha) {
		return this.Login.autentica(senha);
	}

	@Override
	public int compareTo(Funcionario o) {
		return super.compareTo(o);
	}

}
