package ted4q4;

public class Produto {
	private String nome;
	private double pre�o;
	private int quantidade;	
	
	public Produto(String nome, double pre�o, int quantidade) {
		super();
		this.nome = nome;
		this.pre�o = pre�o;
		this.quantidade = quantidade;
	}
	
	public void vendeuProduto () {
		this.quantidade = quantidade --;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", pre�o=" + pre�o + "]";
	}
	
	

}
