package br.com.javaBank.modelo;

public class Autenticador {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		
		if(this.senha == senha) {
			System.out.println("Login efetuado com sucesso!");
			return true;
		} else {
			System.out.println("Senha Incorreta");
			return false;
		}
	}
}
