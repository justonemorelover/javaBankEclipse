package br.com.javaBank.teste;

//CRTL + SHIFT + O (importa classes expecíficas utilizadas);
//ou import br.com.javaBank.modelo.*; (importa todas as classes do pacote)
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import br.com.javaBank.modelo.Caixa;
import br.com.javaBank.modelo.Cliente;
import br.com.javaBank.modelo.Conta;
import br.com.javaBank.modelo.ContaCorrente;
import br.com.javaBank.modelo.ContaPoupanca;
import br.com.javaBank.modelo.Diretor;
import br.com.javaBank.modelo.Funcionario;
import br.com.javaBank.modelo.Gerente;


public class Sistema {
	public static void main(String[] args) {
		
//	CADASTRO CLIENTE
		
		System.out.println("CADASTRO DE CLIENTES");
		Cliente fulano = new Cliente("Fulano", "12345678900", "Mecanic");
		System.out.println(fulano.getNome());
		System.out.println(fulano.getCpf());
		System.out.println(fulano.getProfissao());
		
		System.out.println("");
		
		Cliente beltrano = new Cliente("Beltrano", "11122233389", "Web Developer");
		System.out.println(beltrano.getNome());
		System.out.println(beltrano.getCpf());
		System.out.println(beltrano.getProfissao());
		
		System.out.println("");
		
		Cliente ciclano = new Cliente("Ciclano", "11122233389", "Plumber");
		System.out.println(ciclano.getNome());
		System.out.println(ciclano.getCpf());
		System.out.println(ciclano.getProfissao());
		
		System.out.println("");
		
//	ARRAY SIMPLIFICADO
//		Cliente[] clientes = {fulano, beltrano}; 
//		System.out.println("");
//		
//	Ou.. ARRAY COMUM
//		Cliente[] clientes2 = new Cliente[10];
//		clientes2[0] = fulano;
//		clientes2[1] = beltrano;
//		
//	Ou ainda.. ArrayList <generics>
		List<Cliente> clientela = new ArrayList<>(); 
		clientela.add(fulano);
		clientela.add(beltrano);
		clientela.add(ciclano);
//		clientela.remove(fulano);
//		clientela.get(0);
		System.out.println("Total de Clientes: " + clientela.size());	
		System.out.println("");
		
//	COMPARATOR CLIENTES
		Comparator<Cliente> comparaClientes = new Comparator<>() {

			@Override
			public int compare(Cliente c1, Cliente c2) {
				String nomeC1 = c1.getNome();
				String nomeC2 = c2.getNome();
				return nomeC1.compareTo(nomeC2);
			}
		};
		
//	COMPARADOR CLIENTES LAMBDA
		clientela.sort((c1, c2) -> {
			String nomeC1 = c1.getNome();
			String nomeC2 = c2.getNome();
			return nomeC1.compareTo(nomeC2);
		});
		
		System.out.println("LISTA CLIENTELA LAMBDA");
		clientela.forEach((cliente) -> System.out.println(cliente));
		System.out.println("");
		
	//CADASTRO FUNCIONARIOS
		
//	CAIXA		
		System.out.println("CADASTRO DE FUNCIONARIOS");
		Caixa juliana = new Caixa("Juliana", "12312312345", 1800.00);
		juliana.setSenha(1111);
		
		System.out.println(juliana.getNome());
		System.out.println(juliana.getCpf());
		System.out.println(juliana.getSalario());
		System.out.println(juliana.getBonificacao());
		
		juliana.autentica(1112);
		System.out.println();
		
//	GERENTE
		Gerente roberto = new Gerente("Roberto", "11122233344", 3000.0);
		roberto.setSenha(1234);
		
		System.out.println(roberto.getNome());
		System.out.println(roberto.getCpf());
		System.out.println(roberto.getSalario());
		System.out.println(roberto.getBonificacao());
		
		roberto.autentica(1234);
		System.out.println("");
		
//	DIRETOR 
		Diretor joao = new Diretor("João", "12312312333", 5000.0);
		joao.setSenha(4321);
		
		System.out.println(joao.getNome());
		System.out.println(joao.getCpf());
		System.out.println(joao.getSalario());
		System.out.println(joao.getBonificacao());
		
		joao.autentica(4321);
		System.out.println("");
		
		Funcionario[] funcionarios = {juliana, roberto, joao}; //array
		System.out.println("Numero de funcionarios: " + funcionarios.length);
		System.out.println("");
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		listaFuncionarios.add(juliana);
		listaFuncionarios.add(roberto);
		listaFuncionarios.add(joao);
		System.out.println("Total de Funciarios: " + listaFuncionarios.size());
		System.out.println("");
		
//	COMPARATOR FUNCIONARIOS
		Comparator<Funcionario> comparadorFuncionarios = new Comparator<>() {

			@Override
			public int compare(Funcionario f1, Funcionario f2) {
				String nomeF1 = f1.getNome();
				String nomeF2 = f2.getNome();
				
				return nomeF1.compareTo(nomeF2);
			}
		};
		
		System.out.println("LISTA FUNCIONARIOS");
		listaFuncionarios.sort(comparadorFuncionarios);
		for (Funcionario funcionario : listaFuncionarios) {
			System.out.println(funcionario);
		}
		System.out.println("");
		
//	COMPARATOR FUNCIONARIOS LAMBDA
		
		System.out.println("LISTA FUNCIONARIOS LAMBDA");
		listaFuncionarios.sort((f1, f2) -> {
			String nomeF1 = f1.getNome();
			String nomeF2 = f2.getNome();
			
			return nomeF1.compareTo(nomeF2);
		});
		
		listaFuncionarios.forEach((funcionario) -> System.out.println(funcionario));
		System.out.println("");
		
//	CADASTRO DE CONTAS
		System.out.println("CADASTRO DE CONTAS");
		
//	CONTA CORRENTE
		ContaCorrente cc = new ContaCorrente(1240, 3030);
		cc.setTitular(fulano);
		cc.deposita(3000.0);
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("");
		
		ContaCorrente cc2 = new ContaCorrente(1250, 3032);
		cc2.setTitular(ciclano);
		System.out.println("");
		
//	CONTA POUPANCA
		ContaPoupanca cp = new ContaPoupanca(1230, 3031);
		cp.setTitular(beltrano);
		cp.deposita(1000);
		System.out.println("Saldo: " + cp.getSaldo());
		System.out.println("");
		
		
//	LISTA CONTAS
		List<Conta> listaContas = new ArrayList<>();
		listaContas.add(cp);
		listaContas.add(cc);
		listaContas.add(cc2);

		
//	LISTA.SORT(NULL) (Metodo CompareTo() da classe Conta)
		System.out.println("TESTA METODO CompareTo() NUMERO DA CONTA");
		listaContas.sort(null); //chama o método compreTo da classe Conta;
		for (Conta conta : listaContas) {
			System.out.println(conta.getTitular().getNome() + ": " + conta);
		}
		System.out.println("");
		
//	COMPARATOR TITULAR
		Comparator<Conta> comparadorTitulares = new Comparator<Conta>() { //classe anonima
			@Override
			public int compare(Conta c1, Conta c2) {
				return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
			}
		};
		
		System.out.println("TESTA COMPARATOR (TITULAR)");
		listaContas.sort(comparadorTitulares);
		for (Conta conta : listaContas) {
			System.out.println(conta.getTitular().getNome() + ": " + conta);
		}
		
		System.out.println("");
		
//	COMPARADOR AGENCIAS (LAMBDA);
		listaContas.sort((c1,c2) -> Integer.compare(c1.getAgencia(), c2.getAgencia()));
		System.out.println("TESTA COMPARADOR AGENCIAS (LAMBDA)");
		listaContas.forEach( (conta) -> System.out.println(conta.getTitular().getNome() + ": " + conta) );
		System.out.println("");

		
//	TESTA METODOS
		System.out.println("TESTA METODOS");
		cc.transfere(500, cp);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		cc.saca(2600);
		cp.saca(200);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		cc.saca(200);
		cp.saca(2000);
		System.out.println("Saldo atual conta corrente: " + cc.getSaldo());
		System.out.println("Saldo Atual conta poupanca: " + cp.getSaldo());
		System.out.println("");
		
		System.out.println("Total de Contas: " + Conta.getTotalContas());
		System.out.println("");
		
//	TO STRING TEST
		Object ccc = new ContaCorrente(22, 33);
	    Object ccp = new ContaPoupanca(33, 22);

	    System.out.println(ccc);
	    System.out.println(ccp);
	    
	}
}
