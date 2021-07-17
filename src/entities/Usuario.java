package entities;

public class Usuario {

	
	
	private int numConta;
	private String nome;
	private double valorEmConta;

	public Usuario(int numConta, String nome ) {
		
		this.numConta = numConta;
		this.nome = nome;
		}
		
	
	public Usuario(int numConta, String nome, double depositoInicial) {
		
		this.numConta = numConta;
		this.nome = nome;
		depositaValor (depositoInicial);
		}


	public int getNumConta() {
		return numConta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValorEmConta() {
		return valorEmConta;
	}

		
	public void depositaValor (double valorDeDeposito)	{
	this.valorEmConta += valorDeDeposito;
	}
	
	public void retiraValor (double valorDeRetirada)	{
	this.valorEmConta -= valorDeRetirada + 5.0;
	}
	
	public String toString() {
		return "Account: "
			+numConta
			+" Nome: " 
			+nome
			+", saldo em conta: $ "
			+String.format("%.2f", valorEmConta);
		}
	
}
