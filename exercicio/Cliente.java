package ted4q4;

public class Cliente {
	private String nome;
	private String cpf;
	
	
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
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
	public void setCpf(String pagamento) {
		this.cpf = pagamento;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
	

}
