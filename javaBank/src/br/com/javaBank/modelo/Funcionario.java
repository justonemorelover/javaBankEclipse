package br.com.javaBank.modelo;

public abstract class Funcionario implements Autenticavel, Comparable<Funcionario>{
	private String nome;
	private String cpf;
	private double salario;
	private int senha;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf =  cpf;
		this.salario = salario;
	}
	
	public Funcionario() {
	};

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Funcionario: " + this.nome;
	}
	
	public int compareTo(Funcionario o) {
		return this.getNome().compareTo(o.getNome());
	}
}